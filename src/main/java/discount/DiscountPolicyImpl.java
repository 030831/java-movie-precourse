package discount;

import java.time.LocalDateTime;

public class DiscountPolicyImpl implements DiscountPolicy {

    @Override
    public int movieDay(int price, LocalDateTime date) {
        if (date.getDayOfMonth()%10 == 0) {
            return (int) (price*0.9);
        }
        return price;
    }

    @Override
    public int timeDiscount(int price, LocalDateTime date) {
        if (date.getHour() <= 10 || date.getHour() >= 20) {
            return Math.max(0 , price - 2000);
        }
        return price;
    }

}
