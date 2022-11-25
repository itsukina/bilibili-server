package com.bilibili.gatewayimpl.customer;

import com.bilibili.gatewayimpl.customer.database.CustomerMapper;
import com.bilibili.gatewayimpl.customer.database.dataobject.CustomerDO;
import com.bilibili.domain.customer.Customer;
import com.bilibili.domain.customer.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}