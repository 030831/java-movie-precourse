package repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theater.Theater;

class MemoryTheaterRepositoryTest {

    MemoryTheaterRepository memoryTheaterRepository = new MemoryTheaterRepository();

    @AfterEach
    void afterEach() {
        memoryTheaterRepository.clearRepository();
    }

    @Test
    void save() {
        Theater theater = new Theater(1L);
        Assertions.assertThrows(IllegalStateException.class , () -> {
            memoryTheaterRepository.save(theater);
            memoryTheaterRepository.save(theater);
        });
    }

    @Test
    void findById() {
        Theater theater = new Theater(1L);
        memoryTheaterRepository.save(theater);
        Assertions.assertEquals(theater , memoryTheaterRepository.findById(theater.getId()));
    }
}