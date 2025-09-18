package repository;

import movie.Movie;

public interface MovieRepository {
    void save(Movie movie);
    Movie findById(Long id);
}
