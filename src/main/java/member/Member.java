package member;

import movieTheater.Movie;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private Long id;
    private String password;
    private ArrayList<Movie> reservedMovie;


    public Member(Long id, String password) {
        this.id = id;
        this.password = password;
        this.reservedMovie = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Movie> getReservedMovie() {
        return reservedMovie;
    }

    public void setReservedMovie(Movie movie) {
        reservedMovie.add(movie);
    }
}
