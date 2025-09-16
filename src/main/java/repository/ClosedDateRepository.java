package repository;

import date.ClosedDate;
import date.Date;
import movieTheater.Movie;

public interface ClosedDateRepository {
    void add(ClosedDate closedDate);
    void changeClosedDate(ClosedDate actual , ClosedDate expected);
    boolean canRunMovie(Movie movie);
}
