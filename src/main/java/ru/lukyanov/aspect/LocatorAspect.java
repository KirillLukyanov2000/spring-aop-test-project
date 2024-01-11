package ru.lukyanov.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LocatorAspect {
    @Before("ru.lukyanov.aspect.LocatorPointcut.isServiceByAnnotation()")
    public void annotatedServiceStartingLog(JoinPoint joinPoint) {
        log.warn(">>> AspectJ Advice before annotated service: {}", joinPoint.toShortString());
    }

    @AfterReturning("ru.lukyanov.aspect.LocatorPointcut.isServiceByMethodName()")
    public void namedMethodFinishedSuccessfullyLog(JoinPoint joinPoint) {
        log.warn(">>> AspectJ Advice after named method returned value: {}", joinPoint.getTarget().getClass());
    }

    @AfterThrowing("ru.lukyanov.aspect.LocatorPointcut.isServiceByMethodName()")
    public void namedMethodThrewExceptionLog(JoinPoint joinPoint) {
        log.warn(">>> AspectJ Advice after named method threw Exception: {}", joinPoint.toLongString());
    }

}
