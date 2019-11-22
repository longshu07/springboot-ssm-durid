package com.four.shopshow.service.Impl;

import com.four.shopshow.dao.GilrMapper;
import com.four.shopshow.entity.Girl;
import com.four.shopshow.service.GilrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :龙叔
 * @description:TODO
 * @date :2019/11/7 10:38
 */
@Service
public class GilrServiceImpl implements GilrService {
    @Resource
    private GilrMapper gilrMapper;

    @Override
    public Girl getUser() {
        return gilrMapper.getUser();
    }
}
