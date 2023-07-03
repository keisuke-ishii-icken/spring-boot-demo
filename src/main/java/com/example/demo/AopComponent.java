package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AopComponent {
    @Before("execution(* com.example.demo.*.*(..))")
    public void doSomething1(JoinPoint jp) {
        log.info(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを開始します");
    }

    @After("execution(* com.example.demo.*.*(..))")
    public void doSomething2(JoinPoint jp) {
        log.info(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを終了します");
    }
}