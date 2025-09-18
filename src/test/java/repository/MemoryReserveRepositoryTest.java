package repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reserve.Reserve;

class MemoryReserveRepositoryTest {

    MemoryReserveRepository reserveRepository = new MemoryReserveRepository();

    @AfterEach
    void afterEach() {
        reserveRepository.clearRepository();
    }


    @Test
    void save() {
        Reserve reserve = new Reserve(1L);

        Assertions.assertThrows(IllegalStateException.class , () -> {
            reserveRepository.save(reserve);
            reserveRepository.save(reserve);
        });
    }

    @Test
    void findById() {
        Reserve reserve = new Reserve(1L);
        reserveRepository.save(reserve);
        Assertions.assertEquals(reserve , reserveRepository.findById(reserve.getId()));
    }

}