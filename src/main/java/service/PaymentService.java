package service;

import java.time.LocalDateTime;

public interface PaymentService {
    int payment(int price , LocalDateTime date);
    int paymentWithPointAndCash(int price, int point , LocalDateTime date);
    int paymentWithPointAndCard(int price, int point , LocalDateTime date);
}
