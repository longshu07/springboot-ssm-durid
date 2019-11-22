package com.four.shopshow.config;

import com.four.shopshow.handler.AuthLimitHandler;
import com.four.shopshow.handler.LoginExpireHandler;
import com.four.shopshow.handler.LoginFailureHandler;
import com.four.shopshow.handler.LoginSuccessHandler;
import com.four.shopshow.service.Impl.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

import javax.annotation.Resource;

/**
 * 用于管控登录访问权限
 */


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyFilterSecurityInterceptor myFilterSecurityInterceptor;

    @Resource
    private CustomUserService customUserService;


//    @Autowired
//    UserDetailsService customUserService;//注册

    @Resource
    private LoginSuccessHandler loginSuccessHandler;

    @Resource
    private LoginExpireHandler loginExpireHandler;

    @Resource
    private LoginFailureHandler loginFailureHandler;

    @Resource
    private AuthLimitHandler authLimitHandler;

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置UserDetailsService以及密码规则
        auth.userDetailsService(customUserService).passwordEncoder(passwordEncoder());//user Details Service验证

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        /* 开启跨域共享，  跨域伪造请求限制=无效 */
        http.cors().and().csrf().disable();

        /* 开启授权认证 */
        http.authorizeRequests().anyRequest().authenticated();

        /* 登录配置
        * 可实现通过postman 的post请求登录成功
        * */
        http.formLogin().usernameParameter("username").passwordParameter("password").loginProcessingUrl("/login");

        http.formLogin().successHandler(loginSuccessHandler);
        http.formLogin().failureHandler(loginFailureHandler);
        http.exceptionHandling().accessDeniedHandler(authLimitHandler);
        http.addFilterBefore(myFilterSecurityInterceptor, FilterSecurityInterceptor.class);

//        http.authorizeRequests()
//                .antMatchers("/css/**").permitAll()
//                .anyRequest().authenticated() //任何请求,登录后可以访问
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/")
//                .failureUrl("/error")
//                .permitAll() //登录页面用户任意访问
//                .and()
//                .logout().permitAll(); //注销行为任意访问
//        http.addFilterBefore(myFilterSecurityInterceptor, FilterSecurityInterceptor.class);
    }

}

