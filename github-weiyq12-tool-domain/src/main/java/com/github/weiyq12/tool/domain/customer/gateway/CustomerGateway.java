package com.github.weiyq12.tool.domain.customer.gateway;

import com.github.weiyq12.tool.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
