package com.github.weiyq12.tool.domain.customer.gateway;

import com.github.weiyq12.tool.domain.customer.Customer;
import com.github.weiyq12.tool.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
