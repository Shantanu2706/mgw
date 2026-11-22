package com.shantanu.mgw.controller;

import com.shantanu.mgw.dto.PaymentRequestDTO;
import com.shantanu.mgw.dto.PaymentResponseDTO;
import com.shantanu.mgw.service.MgwService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MgwController {
    private final MgwService mgwService;

    public MgwController(MgwService mgwService) {
        this.mgwService = mgwService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentResponseDTO> processPayment(@RequestBody PaymentRequestDTO paymentRequest) {
        PaymentResponseDTO response = mgwService.processPayment(paymentRequest);
        return ResponseEntity.ok(response);
    }
}
