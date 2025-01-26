package com.dubey.Workwhiz.controller;

import com.dubey.Workwhiz.modal.PlanType;
import com.dubey.Workwhiz.modal.User;
import com.dubey.Workwhiz.response.PaymentLinkResponse;
import com.dubey.Workwhiz.service.UserService;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Value("${razorpay.api.key}")
    private String apiKey;

    @Value("${razorpay.api.secret}")
    private String apiSecret;

    @Autowired
    private UserService userService;

    @PostMapping("/{planType}")
    public ResponseEntity<PaymentLinkResponse> createPaymentLink(
            @PathVariable PlanType planType,
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        User user = userService.findUserProfileByJwt(jwt);

        // Set the base amount in paise (799 INR)
        int amount = 799 * 100;

        // Adjust amount for annually plan
        if (planType.equals(PlanType.ANNUALLY)) {
            amount = amount * 12; // Annual plan for 12 months
            amount = (int) (amount * 0.7); // Apply 30% discount
        }

        // Initialize Razorpay client
        RazorpayClient razorpayClient = new RazorpayClient(apiKey, apiSecret);

        // Create the payment link request payload
        JSONObject paymentLinkRequest = new JSONObject();
        paymentLinkRequest.put("amount", amount);
        paymentLinkRequest.put("currency", "INR");

        JSONObject customer = new JSONObject();
        customer.put("name", user.getFullName());
        customer.put("email", user.getEmail());
        paymentLinkRequest.put("customer", customer);

        JSONObject notify = new JSONObject();
        notify.put("email", true);
        paymentLinkRequest.put("notify", notify);

        // Callback URL for payment success
        paymentLinkRequest.put("callback_url", "http://localhost:5173/upgrade_plan/success?planType=" + planType);

        // Create payment link using Razorpay client
        PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);
        String paymentLinkId = payment.get("id");
        String paymentLinkUrl = payment.get("short_url");

        // Prepare response
        PaymentLinkResponse res = new PaymentLinkResponse(paymentLinkId, paymentLinkUrl);
        res.setPayment_link_url(paymentLinkUrl);
        res.setPayment_link_id(paymentLinkId);

        // Return response
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
