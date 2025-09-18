package discount;

import grade.Grade;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountPolicyImplTest {

    DiscountPolicy discountPolicy = new DiscountPolicyImpl();

    @Test
    void movieDay() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 0,0);
        int price = Grade.S.getPrice();

        assertEquals(price*0.9 , discountPolicy.movieDay(price , date));

        date = LocalDateTime.of(2025,9,11 , 0,0);

        assertEquals(price , discountPolicy.movieDay(price , date));
    }

    @Test
    void timeDiscount() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 7,0);
        int price = Grade.S.getPrice();

        assertEquals(price - 2000, discountPolicy.timeDiscount(price , date));

        date =  LocalDateTime.of(2025,9,10 , 12,0);

        assertEquals(price , discountPolicy.timeDiscount(price , date));

    }
}