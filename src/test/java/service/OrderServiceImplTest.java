package service;

import member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.MemoryMemberRepository;
import repository.MemoryReserveRepository;
import reserve.Reserve;
import screen.Screen;

import java.time.LocalDateTime;

class OrderServiceImplTest {

    OrderServiceImpl orderService = new OrderServiceImpl();

    @AfterEach
    void afterEach() {
        MemoryReserveRepository memoryReserveRepository = new MemoryReserveRepository();
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memoryReserveRepository.clearRepository();
        memberRepository.clearRepository();
    }

    @Test
    void orderMovie() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 8,0);
        Member member = new Member(1L , "A");
        Reserve reserve = new Reserve(1L);
        Screen screen = new Screen(1L , 5 , 5);

        Assertions.assertEquals(8800 , orderService.orderMovie(member , reserve , screen , 'A' , 0 , date));
    }

    @Test
    void orderMovieWithPointAndCard() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 8,0);
        Member member = new Member(1L , "A");
        Reserve reserve = new Reserve(1L);
        Screen screen = new Screen(1L , 5 , 5);

        Assertions.assertEquals(5510 , orderService.orderMovieWithPointAndCard(member , reserve , screen , 'A' , 0 , 3000,date));
    }

    @Test
    void orderMovieWithPointAndCash() {
        LocalDateTime date =  LocalDateTime.of(2025,9,10 , 8,0);
        Member member = new Member(1L , "A");
        Reserve reserve = new Reserve(1L);
        Screen screen = new Screen(1L , 5 , 5);

        Assertions.assertEquals(5684 , orderService.orderMovieWithPointAndCash(member , reserve , screen , 'A' , 0 , 3000,date));
    }
}