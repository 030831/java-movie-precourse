package payment;

import movieTheater.Movie;

public class MovieTheaterDiscountPolicy  {

    public int eventDiscount(int price , Movie movie) {
        int discounted = movieDay(price , movie);
        discounted = timeDiscount(discounted , movie);

        return discounted;
    }

    public int movieDay(int price , Movie movie) {
        if (movie.getStartTime().getDay()%10 == 0) {
            return (int) (price*0.9);
        }

        return price;
    }

    public int timeDiscount(int price , Movie movie) {
        if (movie.getStartTime().getHour() <= 11 || movie.getStartTime().getHour() >= 20) {
            return Math.max(0 , price - 2000);
        }
        return  price;
    }

    public int usePoint(int price , int point) {
        return Math.max(0 , price-point);
    }

    public int cardDiscount(int price) {
        return (int) (price*0.95);
    }
    public int cashDiscount(int price) {
        return (int) (price*0.98);
    }
}
