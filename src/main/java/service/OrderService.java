package service;

import member.Member;
import reserve.Reserve;
import screen.Screen;

import java.time.LocalDateTime;

public interface OrderService {
    int orderMovie(Member member , Reserve reserve , Screen screen , char row, int column ,  LocalDateTime date);
    int orderMovieWithPointAndCard(Member member , Reserve reserve , Screen screen , char row, int column , int point ,  LocalDateTime date);
    int orderMovieWithPointAndCash(Member member , Reserve reserve , Screen screen , char row, int column , int point,  LocalDateTime date);
}
