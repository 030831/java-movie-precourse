package repository;

import movieTheater.Movie;

import java.util.*;

public class MemoryMovieTheaterRepository implements MovieTheaterRepository {

    private static final HashMap<Long , Movie> movieRepository = new HashMap<>();
    private static final MemoryClosedDateRepository memoryClosedDateRepository = new MemoryClosedDateRepository();


    @Override
    public Movie save(Movie movie) {
        if (!memoryClosedDateRepository.canRunMovie(movie)) {
            throw new IllegalStateException("영화의 상영시간과 상영관의 폐관시간이 겹칩니다.\n" +
                    movie.getStartTime() + " " +  movie.getEndTime());
        }

        movieRepository.put(movie.getId(), movie);
        return movie;
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.get(id);
    }

    @Override
    public ArrayList<Movie> findByName(String name) {
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieRepository.forEach((key , value) -> {
            if (value.getName().equals(name)) {
                movieArrayList.add(findById(key));
            }
        });
        return movieArrayList;
    }

    @Override
    public boolean validateDuplicateMovie(Movie movie) {

        if (movieRepository.containsKey(movie.getId())) {
            return false;
        }

        return true;
    }

}
