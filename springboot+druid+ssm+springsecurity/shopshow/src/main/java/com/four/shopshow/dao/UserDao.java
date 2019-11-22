package com.four.shopshow.dao;


import com.four.shopshow.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public SysUser findByUserName(String username);
}
