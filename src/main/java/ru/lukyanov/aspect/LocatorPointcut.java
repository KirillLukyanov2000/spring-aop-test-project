package ru.lukyanov.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LocatorPointcut {
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

    @Pointcut("bean(customerService)")
    public void isServiceByBeanName() {
    }

    @Pointcut("isServiceByAnnotation() || within(ru.lukyanov.service.*Customer*)")
    public void isServiceByAnnotationAndByClassName() {
    }
}
