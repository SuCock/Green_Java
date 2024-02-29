package org.example.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Aspect
public class TImeAspect {

    @Pointcut("execution( public * org.components..*(..))") // 어디에 걸꺼냐
    public void publicTarget() {
    }

    @Around("publicTarget()")
    public Object measure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("실행되나");
        LocalTime beforeTime = LocalTime.now();
        try {
            Object result = proceedingJoinPoint.proceed();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LocalTime afterTime = LocalTime.now();

            System.out.println(LocalTime.now());
        }
        return null;
    }
}




