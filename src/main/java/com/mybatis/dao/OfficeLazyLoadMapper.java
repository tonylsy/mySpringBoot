package com.mybatis.dao;

import com.mybatis.bean.Offices;

public interface OfficeLazyLoadMapper {
    Offices getOfficesById(String officeCode);
}
