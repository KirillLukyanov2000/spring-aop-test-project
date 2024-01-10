package ru.lukyanov.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
@Slf4j
public class Locator {
    @Pointcut("@within(org.springframework.stereotype.Service)")
    public void isServiceByAnnotation() {
    }

    @Pointcut("within(ru.lukyanov..*Service)")
    public void isServiceByClassName() {
    }

    @Pointcut("within(ru.lukyanov.service.*)")
    public void isServiceByPackageName() {
    }

    @Pointcut("execution(public ru.lukyanov.entity.Customer ru.lukyanov.service.CustomerService.get(Long))")
    public void isServiceByMethodName() {
    }
}
