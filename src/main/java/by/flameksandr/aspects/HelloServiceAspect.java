package by.flameksandr.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    @Before("execution(* by.flameksandr.services.HelloService.hello(..))")
    public void before() {
        System.out.println("A");
    }

}
