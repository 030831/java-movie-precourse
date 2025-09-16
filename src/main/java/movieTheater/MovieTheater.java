package movieTheater;

import date.ClosedDate;
import payment.MovieTheaterDiscountPolicy;
import repository.MemoryMovieTheaterRepository;
import repository.MovieTheaterRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MovieTheater {

    private ArrayList<ClosedDate> closedDates = new ArrayList<>();

    public ArrayList<ClosedDate> getClosedDates() {
        return closedDates;
    }

    public void setClosedDates(ClosedDate closedDate) {
        this.closedDates.add(closedDate);
    }
}
