package service;

import member.Member;
import reserve.Reserve;
import screen.Screen;

import java.time.LocalDateTime;

public class OrderServiceImpl implements OrderService {

    private static final ReserveService reserveService = new ReserveServiceImpl();
    private static final PaymentService paymentService = new PaymentServiceImpl();

    @Override
    public int orderMovie(Member member, Reserve reserve, Screen screen, char row, int column ,  LocalDateTime date) {
        reserveService.reserveMovie(member, reserve, screen, row, column);
        return paymentService.payment(screen.getSeatList().get(row-'A').get(column).getPrice() , date);
    }

    @Override
    public int orderMovieWithPointAndCard(Member member, Reserve reserve, Screen screen, char row, int column , int point , LocalDateTime date) {
        reserveService.reserveMovie(member, reserve, screen, row, column);
        return paymentService.paymentWithPointAndCard(screen.getSeatList().get(row-'A').get(column).getPrice(), point , date);
    }

    @Override
    public int orderMovieWithPointAndCash(Member member, Reserve reserve, Screen screen, char row, int column ,int point,  LocalDateTime date) {
        reserveService.reserveMovie(member, reserve, screen, row, column);
        return paymentService.paymentWithPointAndCash(screen.getSeatList().get(row-'A').get(column).getPrice() ,point , date);
    }

}
