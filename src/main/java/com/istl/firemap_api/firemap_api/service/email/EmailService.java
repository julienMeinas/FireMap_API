package com.istl.firemap_api.firemap_api.service.email;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    public void sendEmail(String body, String subject);
}
