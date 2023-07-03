package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public FilterRegistrationBean demoFilter1() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new DemoFilter1());
        bean.addUrlPatterns("/*");
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean demoFilter2() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new DemoFilter2());
        bean.addUrlPatterns("/*");
        bean.setOrder(2);
        return bean;
    }
}