package com.shantanu.mgw.service;

import com.shantanu.mgw.dto.PaymentRequestDTO;
import com.shantanu.mgw.dto.PaymentResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class MgwServiceImpl implements MgwService {

    @Override
    public PaymentResponseDTO processPayment(PaymentRequestDTO paymentRequestDTO) {
        PaymentResponseDTO paymentResponseDTO = new PaymentResponseDTO();
        String paymentMethod = paymentRequestDTO.getPaymentMethod();
        if(paymentMethod.equals("paypal")){
            paymentResponseDTO.setMessage("Payment processed successfully via PayPal!");
            paymentResponseDTO.setStatus("SUCCESS");
        }else if(paymentMethod.equals("applepay")){
            paymentResponseDTO.setMessage("Payment processed successfully via Apple Pay!");
            paymentResponseDTO.setStatus("SUCCESS");
        }else{
            paymentResponseDTO.setMessage("Payment method not supported");
            paymentResponseDTO.setStatus("FAILED");
        }
        return paymentResponseDTO;
    }
}
