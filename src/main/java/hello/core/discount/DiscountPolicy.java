package hello.core.discount;

import java.lang.reflect.Member;

public interface DiscountPolicy {
    int discount(Member member, int pirce);
}
