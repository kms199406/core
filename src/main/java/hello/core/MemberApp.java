package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig(); // AppConfig 인스턴스 생성
        MemberService memberService = appConfig.memberService(); // 인스턴스를 통해 메서드 호출
        OrderService orderService = appConfig.orderService();
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member =" + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}