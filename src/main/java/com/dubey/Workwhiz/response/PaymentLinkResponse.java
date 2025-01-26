package com.dubey.Workwhiz.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PaymentLinkResponse {
    private String payment_link_url;
    private String payment_link_id;

    // No-args constructor
    public PaymentLinkResponse() {}

    // All-args constructor
    public PaymentLinkResponse(String payment_link_url, String payment_link_id) {
        this.payment_link_url = payment_link_url;
        this.payment_link_id = payment_link_id;
    }

    // Getter for payment_link_url
    public String getPayment_link_url() {
        return payment_link_url;
    }

    // Setter for payment_link_url
    public void setPayment_link_url(String payment_link_url) {
        this.payment_link_url = payment_link_url;
    }

    // Getter for payment_link_id
    public String getPayment_link_id() {
        return payment_link_id;
    }

    // Setter for payment_link_id
    public void setPayment_link_id(String payment_link_id) {
        this.payment_link_id = payment_link_id;
    }

    // toString method
    @Override
    public String toString() {
        return "PaymentLinkResponse{" +
                "payment_link_url='" + payment_link_url + '\'' +
                ", payment_link_id='" + payment_link_id + '\'' +
                '}';
    }

    // hashCode and equals methods (optional)
    @Override
    public int hashCode() {
        int result = payment_link_url != null ? payment_link_url.hashCode() : 0;
        result = 31 * result + (payment_link_id != null ? payment_link_id.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PaymentLinkResponse that = (PaymentLinkResponse) obj;
        if (payment_link_url != null ? !payment_link_url.equals(that.payment_link_url) : that.payment_link_url != null)
            return false;
        return payment_link_id != null ? payment_link_id.equals(that.payment_link_id) : that.payment_link_id == null;
    }
}
