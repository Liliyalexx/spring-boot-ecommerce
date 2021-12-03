package com.med.ecommerce.service;

import com.med.ecommerce.dto.Purchase;
import com.med.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
