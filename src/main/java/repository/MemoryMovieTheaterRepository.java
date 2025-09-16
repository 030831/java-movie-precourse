package repository;


import movieTheater.Movie;
import java.util.ArrayList;

public class MemoryMovieTheaterRepository implements MovieTheaterRepository {

    @Override
    public Movie save(Movie movie) {
        return null;
    }

    @Override
    public Movie findById(Long id) {
        return null;
    }

    @Override
    public ArrayList<Movie> findByName(String name) {
        return null;
    }

    @Override
    public boolean validateDuplicateMovie(Movie movie) {
        return false;
    }
}
