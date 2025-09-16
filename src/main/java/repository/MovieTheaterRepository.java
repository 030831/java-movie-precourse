package repository;

import movieTheater.Movie;
import java.util.ArrayList;

public interface MovieTheaterRepository {

    Movie save(Movie movie);
    Movie findById(Long id);
    ArrayList<Movie> findByName(String name);
    boolean validateDuplicateMovie(Movie movie);

}
