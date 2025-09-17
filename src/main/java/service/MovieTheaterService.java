package service;

import member.Member;
import movieTheater.Movie;

public interface MovieTheaterService {

    int reserveMovie(Member member , Movie movie, char seatRow , int seatColumn);
    int reserveMovieWithPointAndCard(Member member , Movie movie, char seatRow , int seatColumn , int point);
    int reserveMovieWithPointAndCash(Member member, Movie movie, char seatRow , int seatColumn , int point);
    boolean validateReserve(Member member , Movie movie);


}
