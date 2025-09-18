package repository;

import movie.Movie;

import java.util.HashMap;
import java.util.Map;

public class MemoryMovieRepository implements MovieRepository {

    private static final Map<Long , Movie> movieRepository = new HashMap<>();

    @Override
    public void save(Movie movie) {
        if (movieRepository.containsKey(movie.getId())) {
            throw new IllegalStateException("이미 존재하는 id 입니다.");
        }

        movieRepository.put(movie.getId() , movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.get(id);
    }


    public void clearRepository() {
        movieRepository.clear();
    }
}
