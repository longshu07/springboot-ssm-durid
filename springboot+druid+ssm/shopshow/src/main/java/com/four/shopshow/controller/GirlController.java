package com.four.shopshow.controller;


//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
import com.four.shopshow.entity.Girl;
import com.four.shopshow.service.GilrService;
//import com.four.shopshow.service.SelfUserDetailsService;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author :龙叔
 * @description:TODO
 * @date :2019/11/7 10:47
 */
@RestController
@RequestMapping("/test")
public class GirlController {

    @Resource
    private GilrService gilrService;

//    @Resource
//    private SelfUserDetailsService orderService;
    @RequestMapping("/getUser")
    public Girl getUser() {
        Girl user =  gilrService.getUser();
        return user;
    }


    /**
     * 简单注册功能
     * @param username
     * @param password
     * @return
     */
//    public Map<String, Object> login(String username, String password){
//        orderService.loadUserByUsername(username,password);
//
//    }
//    @PostMapping("/register")
//    public Map<String, Object> register(String username, String password){
//        orderService.register(username,password);
//        return ResultVO.result(ResultEnum.SUCCESS,true);
//    }
}
