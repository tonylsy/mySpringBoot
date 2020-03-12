package com.myspringboot.service.impl;

import com.mybatis.bean.Customers;
import com.mybatis.dao.CustomersMapper;
import com.myspringboot.service.CustomersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Resource
    private CustomersMapper customersMapper;

    @Override
    public String hello() {
        return "here use the service and controller";
    }

    @Override
    public Customers getCustomersByCustomerNum(Integer CustomerNum) {
        return customersMapper.selectByPrimaryKey(CustomerNum);
    }


}
