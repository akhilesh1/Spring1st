package dev.akhilesh.catalog.product;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* *.*.*.*.*.checkout(..))")
    public void logger(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println("Args "+jp.getArgs()[0].toString());
        System.out.println("beware checkout is being called");
    }

    @Pointcut("execution(* *.*.*.*.*.Quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println( "After returning"+ retVal);
    }
}
