package com.myspringboot.controller;

import com.mybatis.bean.Customers;
import com.myspringboot.Common.Result;
import com.myspringboot.service.CustomersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "I run a thymeleaf!");
        mv.setViewName("helloworld");
        return mv;
    }

    @RequestMapping("/getword")
    @ResponseBody
    public Result helloworldJQ(String id) {
        return Result.OK("here the data by jquery, and get the param:" + id, null);
    }

}