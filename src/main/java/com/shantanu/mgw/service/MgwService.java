package com.shantanu.mgw.service;

import com.shantanu.mgw.dto.PaymentRequestDTO;
import com.shantanu.mgw.dto.PaymentResponseDTO;

public interface MgwService {
    PaymentResponseDTO processPayment(PaymentRequestDTO paymentRequestDTO);
}
