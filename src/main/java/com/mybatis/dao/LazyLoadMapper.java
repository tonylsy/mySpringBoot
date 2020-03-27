package com.mybatis.dao;

import com.mybatis.bean.EmployeesLazyLoad;

public interface LazyLoadMapper {
    EmployeesLazyLoad getEmployeeById(Integer id);
    EmployeesLazyLoad getEmployeeByIdNoLazy(Integer id);
}
