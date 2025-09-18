package discount;

import java.time.LocalDateTime;

public interface DiscountPolicy {
    int movieDay(int price , LocalDateTime date);
    int timeDiscount(int price , LocalDateTime date);
}
