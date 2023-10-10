package com.msemail.notification.controllers;

import com.msemail.notification.dtos.EmailDtos;
import jakarta.validation.Valid;
import com.msemail.notification.models.EmailModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.msemail.notification.services.EmailService;

@RequestMapping("/sending")
@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDtos emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);

        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

}

