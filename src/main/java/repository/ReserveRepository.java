package repository;

import reserve.Reserve;

public interface ReserveRepository {
    void save(Reserve reserve);
    Reserve findById(Long id);
}
