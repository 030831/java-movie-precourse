package repository;

import date.ClosedDate;
import movieTheater.Movie;

public class MemoryClosedDateRepository implements ClosedDateRepository {

    @Override
    public void add(ClosedDate closedDate) {

    }

    @Override
    public void changeClosedDate(ClosedDate actual, ClosedDate expected) {

    }

    @Override
    public boolean canRunMovie(Movie movie) {
        return false;
    }
}
