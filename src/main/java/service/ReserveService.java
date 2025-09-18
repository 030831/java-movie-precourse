package service;

import member.Member;
import reserve.Reserve;
import screen.Screen;

public interface ReserveService {
    void reserveMovie(Member member , Reserve reserve , Screen screen , char row, int column);
    void validateDuplicateReserve(Member member, Reserve reserve);
    void validateReservedSeat(Screen screen, char row, int column);
}
