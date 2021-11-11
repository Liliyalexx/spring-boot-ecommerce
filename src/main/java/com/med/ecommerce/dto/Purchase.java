package com.med.ecommerce.dto;


import com.med.ecommerce.entity.Address;
import com.med.ecommerce.entity.Customer;
import com.med.ecommerce.entity.Order;
import com.med.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
