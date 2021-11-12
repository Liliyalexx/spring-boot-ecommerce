package com.med.ecommerce.service;

import com.med.ecommerce.dao.CustomerRepository;
import com.med.ecommerce.dto.Purchase;
import com.med.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }


    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
