package service;

import discount.DiscountPolicyImpl;

import java.time.LocalDateTime;

public class PaymentServiceImpl implements PaymentService{

    DiscountPolicyImpl discountPolicy = new DiscountPolicyImpl();
    @Override
    public int payment(int price, LocalDateTime date) {
        return discountPolicy.timeDiscount(discountPolicy.movieDay(price , date), date);
    }

    @Override
    public int paymentWithPointAndCash(int price, int point ,LocalDateTime date) {
        price = discountPolicy.timeDiscount(discountPolicy.movieDay(price , date), date);
        return Math.max(0 , (int)((price-point)*0.98));
    }

    @Override
    public int paymentWithPointAndCard(int price, int point , LocalDateTime date) {
        price = discountPolicy.timeDiscount(discountPolicy.movieDay(price , date), date);
        return Math.max(0 , (int)((price-point)*0.95));
    }
}
