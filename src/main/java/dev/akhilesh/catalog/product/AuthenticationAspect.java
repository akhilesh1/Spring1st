package dev.akhilesh.catalog.product;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
    @Pointcut("within(dev.akhilesh.catalog.product.*)")
    public void authenticatingPointCut(){

    }

    @Pointcut("within(dev.akhilesh.catalog.product.*)")
    public void authorizingPointCut(){

    }
    @Before("authenticatingPointCut() && authorizingPointCut()")
    public void authenticate()
    {
        System.out.println("authenticating");
    }
}
