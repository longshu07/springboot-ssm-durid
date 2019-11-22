//package com.four.shopshow.common.security;
//
//import com.alibaba.fastjson.JSON;
//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.stereotype.Component;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//
///**
// * @author :龙叔
// * @description:用户登录失败时返回给前端的数据
// * @date :2019/11/7 15:39
// */
//@Component
//public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler {
//
//    @Override
//    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
//        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_LOGIN_FAILED,false)));
//    }
//
//}