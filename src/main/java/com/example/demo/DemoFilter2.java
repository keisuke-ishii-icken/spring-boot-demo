package com.example.demo;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class DemoFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response
            , FilterChain chain) throws IOException, ServletException {
        log.debug("DemoFilter2 started.");
        chain.doFilter(request, response);
        log.debug("DemoFilter2 ended.");
    }
}