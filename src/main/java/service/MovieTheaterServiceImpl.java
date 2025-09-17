package service;

import date.Date;
import member.Member;
import movieTheater.Movie;
import payment.MovieTheaterDiscountPolicy;
import java.util.List;

public class MovieTheaterServiceImpl implements MovieTheaterService{

    private final MovieTheaterDiscountPolicy movieTheaterDiscountPolicy = new MovieTheaterDiscountPolicy();

    @Override
    public int reserveMovie(Member member , Movie movie, char seatRow, int seatColumn) {
        if (validateReserve(member , movie)) {
            member.setReservedMovie(movie);
        }

        int price = movie.getSeatPrice(seatRow , seatColumn);

        return movieTheaterDiscountPolicy.eventDiscount(price , movie);
    }


    @Override
    public int reserveMovieWithPointAndCard(Member member , Movie movie, char seatRow , int seatColumn , int point) {
        if (validateReserve(member , movie)) {
            member.setReservedMovie(movie);
        }

        int price = movie.getSeatPrice(seatRow , seatColumn);

        price = movieTheaterDiscountPolicy.eventDiscount(price , movie);
        price = movieTheaterDiscountPolicy.usePoint(price , point);
        price = movieTheaterDiscountPolicy.cardDiscount(price);

        return price;
    }

    @Override
    public int reserveMovieWithPointAndCash(Member member , Movie movie, char seatRow, int seatColumn , int point) {
        if (validateReserve(member , movie)) {
            member.setReservedMovie(movie);
        }

        int price = movie.getSeatPrice(seatRow , seatColumn);

        price = movieTheaterDiscountPolicy.eventDiscount(price , movie);
        price = movieTheaterDiscountPolicy.usePoint(price , point);
        price = movieTheaterDiscountPolicy.cashDiscount(price);

        return price;
    }



    @Override
    public boolean validateReserve(Member member , Movie movie) {
        if (movie.isReservedMember(member)) {
            return false;
        }

        List<Movie> reservedMovie = member.getReservedMovie();

        for (int i = 0 ; i < reservedMovie.size() ; i++) {
            if (Date.isTimeOverlap(reservedMovie.get(i).getStartTime() , reservedMovie.get(i).getEndTime() ,
                    movie.getStartTime() , movie.getEndTime())) {
                return false;
            }
        }
        return true;
    }
}
