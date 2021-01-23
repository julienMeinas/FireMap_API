package com.istl.firemap_api.firemap_api.controller.email;

import org.springframework.web.bind.annotation.RequestBody;

public interface EmailController {
    public void sendEmail(String body, String subject);
}
