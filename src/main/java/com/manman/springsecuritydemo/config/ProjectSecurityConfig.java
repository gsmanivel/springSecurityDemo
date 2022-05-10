package com.manman.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/balance")
//                .authenticated()
//                .antMatchers("/aboutUs")
//                .permitAll()
//                .and().formLogin()
//                .and().httpBasic();


        //Deny All the request
        //http.authorizeRequests().anyRequest().denyAll();

        //Permit All the request
        http.authorizeRequests().anyRequest().permitAll();
    }
}
