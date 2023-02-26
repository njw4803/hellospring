package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //AOP를 쓰기 위한 어노테이션
@Component // 컴포넌트 스캔 방식으로 빈 주입
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))") //적용할 곳 설정
    //@Around("execution(* hello.hellospring.service..*(..))") //적용할 곳 설정
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());

        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");
        }

    }
}
