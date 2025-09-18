package service;

import member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.MemoryMemberRepository;
import repository.MemoryReserveRepository;
import reserve.Reserve;
import screen.Screen;

class ReserveServiceImplTest {

    ReserveServiceImpl reserveService = new ReserveServiceImpl();

    @AfterEach
    void afterEach() {
        MemoryReserveRepository memoryReserveRepository = new MemoryReserveRepository();
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memoryReserveRepository.clearRepository();
        memberRepository.clearRepository();
    }

    @Test
    void reserveMovie() {
        Member member = new Member(1L , "A");
        Reserve reserve = new Reserve(1L);
        Screen screen = new Screen(1L , 5 , 5);

        reserveService.reserveMovie(member, reserve, screen, 'A', 0);

        screen.getSeatList().getFirst().getFirst().setReserved(true);
        Assertions.assertThrows(IllegalArgumentException.class , () -> {
            reserveService.validateReservedSeat(screen , 'A' , 0);
        });
    }

    @Test
    void validateDuplicateReserve() {
        Member member = new Member(1L , "A");
        Reserve reserve = new Reserve(1L);
        reserve.setScreen(new Screen(1L));

        reserveService.validateDuplicateReserve(member, reserve);
        member.addReserveList(reserve);
        Assertions.assertThrows(IllegalArgumentException.class , () -> {
            reserveService.validateDuplicateReserve(member, reserve);
        });
    }

    @Test
    void validateReservedSeat() {
        Screen screen = new Screen(1L , 5 , 5);
        screen.getSeatList().getFirst().getFirst().setReserved(true);

        Assertions.assertThrows(IllegalArgumentException.class , () -> {
            reserveService.validateReservedSeat(screen , 'A' , 0);
        });
    }
}