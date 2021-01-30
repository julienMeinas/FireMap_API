package com.istl.firemap_api.firemap_api.service.email;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    public String sendEmail(String body, String subject);
}
