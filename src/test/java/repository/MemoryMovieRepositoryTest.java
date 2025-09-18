package repository;

import movie.Movie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMovieRepositoryTest {

    MemoryMovieRepository movieRepository = new MemoryMovieRepository();

    @AfterEach
    void afterEach() {
        movieRepository.clearRepository();
    }
    @Test
    void save() {
        Movie movie = new Movie(1L , "A");

        Assertions.assertThrows(IllegalStateException.class , () -> {
            movieRepository.save(movie);
            movieRepository.save(movie);
        });
    }

    @Test
    void findById() {
        Movie movie = new Movie(1L , "A");
        movieRepository.save(movie);
        Assertions.assertEquals(movie , movieRepository.findById(movie.getId()));
    }

}