//package com.four.shopshow.common.security;
//
///**
// * @author :龙叔
// * @description:TODO
// * @date :2019/11/7 15:50
// */
//
//import com.alibaba.fastjson.JSON;
//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author: zzx
// * @date: 2018/10/16 9:59
// * @description: 登出成功
// */
//@Component
//public class AjaxLogoutSuccessHandler implements LogoutSuccessHandler {
//    @Override
//    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_LOGOUT_SUCCESS,true)));
//    }
//
//}