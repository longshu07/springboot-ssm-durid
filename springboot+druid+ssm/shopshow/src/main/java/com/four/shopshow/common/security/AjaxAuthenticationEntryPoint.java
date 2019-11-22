//package com.four.shopshow.common.security;
//
//import com.alibaba.fastjson.JSON;
//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author :龙叔
// * @description:用户未登录时返回给前端的数据
// * @date :2019/11/7 15:36
// */
//@Component
//public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {
//
//    @Override
//    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
//        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_NEED_AUTHORITIES,false)));
//    }
//}
