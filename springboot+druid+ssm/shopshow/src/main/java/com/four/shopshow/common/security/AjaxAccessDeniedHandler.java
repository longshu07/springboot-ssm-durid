//package com.four.shopshow.common.security;
//
//import com.alibaba.fastjson.JSON;
//import com.four.shopshow.common.ResultEnum;
//import com.four.shopshow.common.ResultVO;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author :龙叔
// * @description:无权访问
// * @date :2019/11/7 15:37
// */
//@Component
//public class AjaxAccessDeniedHandler implements AccessDeniedHandler {
//    @Override
//    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
//        httpServletResponse.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.USER_NO_ACCESS,false)));
//    }
//}