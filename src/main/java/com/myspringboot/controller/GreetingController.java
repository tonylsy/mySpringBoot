package com.myspringboot.controller;

import com.mybatis.bean.Customers;
import com.myspringboot.service.CustomersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    private CustomersService customersService;

    @Autowired
    private void setCustomerService(CustomersService customersService) {
        this.customersService = customersService;
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return customersService.hello();
    }

    @RequestMapping("/customer")
    @ResponseBody
    public Customers getCustomer(@Param("id") Integer id) {
        return customersService.getCustomersByCustomerNum(id);
    }

}