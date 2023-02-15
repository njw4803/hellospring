package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // @Controller 사용 시 스프링 컨테이너에  MemberController 빈을 등록한다.
public class MemberController {

    private final MemberService memberService;

    //@Autowired // 컴포넌트 스캔방식, 연결시켜주는 역할, 스프링 빈에 등록되어있는 객체를 주입시킨다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
