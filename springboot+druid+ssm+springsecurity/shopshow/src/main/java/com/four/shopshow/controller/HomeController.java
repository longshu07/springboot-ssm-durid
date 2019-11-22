package com.four.shopshow.controller;

import com.four.shopshow.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangyibo on 17/1/18.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
        model.addAttribute("msg", msg);
        return "home";
    }

    @RequestMapping("/login")
    public  String login(){
        return "login";
    }
    //测试admin权限
    @RequestMapping("/admin/test")
    @ResponseBody
    public String admin(){
        return "hello admin";
    }
    //测试able权限
    @RequestMapping("/abel/test")
    @ResponseBody
    public String abel(){
        return "hello abel";
    }
}
