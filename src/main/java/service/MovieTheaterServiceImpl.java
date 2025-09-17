package service;

import member.Member;
import movieTheater.Movie;

public class MovieTheaterServiceImpl implements MovieTheaterService {

    @Override
    public int reserveMovie(Member member, Movie movie, char seatRow, int seatColumn) {
        return 0;
    }

    @Override
    public int reserveMovieWithPointAndCard(Member member, Movie movie, char seatRow, int seatColumn, int point) {
        return 0;
    }

    @Override
    public int reserveMovieWithPointAndCash(Member member, Movie movie, char seatRow, int seatColumn, int point) {
        return 0;
    }

    @Override
    public boolean validateReserve(Member member, Movie movie) {
        return false;
    }
}
