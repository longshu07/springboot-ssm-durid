package com.four.shopshow.dao;

import com.four.shopshow.entity.Girl;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :龙叔
 * @description:TODO
 * @date :2019/11/7 10:37
 */
@Mapper
public interface GilrMapper {
     Girl getUser();

}
