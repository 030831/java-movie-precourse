package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class PaymentServiceImplTest {

    PaymentServiceImpl paymentService = new PaymentServiceImpl();

    @Test
    void payment() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 12,0);
        Assertions.assertEquals(9000, paymentService.payment(10000, date));

        date =  LocalDateTime.of(2025,9,11 , 12,0);
        Assertions.assertEquals(10000, paymentService.payment(10000, date));
    }

    @Test
    void paymentWithPointAndCash() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 12,0);
        Assertions.assertEquals(3920, paymentService.paymentWithPointAndCash(10000 , 5000, date));

        date =  LocalDateTime.of(2025,9,11 , 12,0);
        Assertions.assertEquals(4900, paymentService.paymentWithPointAndCash(10000 , 5000, date));
    }

    @Test
    void paymentWithPointAndCard() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 12,0);
        Assertions.assertEquals(3800, paymentService.paymentWithPointAndCard(10000 , 5000, date));

        date =  LocalDateTime.of(2025,9,11 , 12,0);
        Assertions.assertEquals(4750, paymentService.paymentWithPointAndCard(10000 , 5000, date));
    }
}