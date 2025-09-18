package repository;

import theater.Theater;

public interface TheaterRepository {
    void save(Theater theater);
    Theater findById(Long id);
}
