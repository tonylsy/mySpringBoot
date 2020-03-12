package com.myspringboot.service;

import com.mybatis.bean.Customers;

public interface CustomersService {
    String hello();
    Customers getCustomersByCustomerNum(Integer CustomerNum);
}
