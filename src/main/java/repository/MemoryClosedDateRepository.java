package repository;

import date.ClosedDate;
import date.Date;
import movieTheater.Movie;
import java.util.ArrayList;
import java.util.List;

public class MemoryClosedDateRepository implements ClosedDateRepository {

    private static List<ClosedDate> closedDateRepository =  new ArrayList<>();

    @Override
    public void add(ClosedDate closedDate) {
        closedDateRepository.add(closedDate);
    }

    @Override
    public void changeClosedDate(ClosedDate actual, ClosedDate expected) {
        for (int i = 0 ; i < closedDateRepository.size() ; i++) {
            if (ClosedDate.isEqualTo(closedDateRepository.get(i) , actual)) {
                closedDateRepository.set(i , expected);
            }
        }
    }

    @Override
    public boolean canRunMovie(Movie movie) {
        for (ClosedDate closedDate : closedDateRepository) {
            if (Date.isTimeOverlap(closedDate.getClosureStartTime(), closedDate.getClosureEndTime(),
                    movie.getStartTime(), movie.getEndTime())) {
                return false;
            }
        }
        return true;
    }
}
