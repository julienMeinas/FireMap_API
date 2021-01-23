package com.istl.firemap_api.firemap_api.service.email;

import com.istl.firemap_api.firemap_api.service.firework.FireworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String body, String subject){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("firemapfr@gmail.com");
        simpleMailMessage.setTo("firemapfr@gmail.com");
        simpleMailMessage.setSubject("[FireMap]"+subject);
        simpleMailMessage.setText(body);
        javaMailSender.send(simpleMailMessage);
    }
}
