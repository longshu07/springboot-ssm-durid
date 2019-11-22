//package com.four.shopshow.common.security;
//
//import com.alibaba.fastjson.JSON;
//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
//import com.four.shopshow.common.utils.JwtTokenUtil;
//import com.four.shopshow.entity.SelfUserDetails;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
//
///**
// * @author :龙叔
// * @description:TODO
// * @date :2019/11/7 15:42
// */
///**
// * @author: zzx
// * @date: 2018/10/15 16:12
// * @description: 用户登录成功时返回给前端的数据
// */
//@Component
//public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//        SelfUserDetails userDetails = (SelfUserDetails) authentication.getPrincipal();
//
//        String jwtToken = JwtTokenUtil.generateToken(userDetails.getUsername(), 1500);
//
//        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_LOGIN_SUCCESS,jwtToken,true)));
//    }
//}