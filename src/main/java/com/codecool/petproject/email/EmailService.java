package com.codecool.petproject.email;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender{

    private final static Logger LOGGER= LoggerFactory.getLogger(EmailService.class); //Logger e din libraria org.slf4j.
    @Autowired
    private final JavaMailSender mailSender;


    @Override
    @Async
    public void send(String to, String email) {
                System.out.println("email sent");
//            try{
//                MimeMessage mimeMessage=mailSender.createMimeMessage();
//                MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
//                helper.setText(email,true);
//                helper.setTo(to);
//                helper.setSubject("Confirm your email");
//                helper.setFrom("contact@teamteamdelivery");
//                mailSender.send(mimeMessage);
//            }catch (MessagingException e){
//                LOGGER.error("failed to send email", e);
//                throw new IllegalStateException("Failed to send email");
//            }
    }
}
