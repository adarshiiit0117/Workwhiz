package com.dubey.Workwhiz.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmailWithToken(String userEmail, String link) throws MessagingException {
        // Create a new MIME message
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");

        // Email subject and body
        String subject = "Join Project Team Invitation";
        String text = "Click the link to join the project team: " + link;

        // Configure email
        helper.setSubject(subject);
        helper.setText(text, true);
        helper.setTo(userEmail);

      try {
          javaMailSender.send(mimeMessage);
      }
      catch (MailSendException e){
          throw new MailSendException("Failed to send email");
      }
    }
}
