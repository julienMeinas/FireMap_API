package com.istl.firemap_api.firemap_api.controller.email;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.service.email.EmailServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmailControllerImpl  implements EmailController {
    private final EmailServiceImpl service;

    public EmailControllerImpl(EmailServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/email")
    public void sendEmail(@RequestParam String body, @RequestParam String subject) {
        this.service.sendEmail(body,subject);
    }
}
