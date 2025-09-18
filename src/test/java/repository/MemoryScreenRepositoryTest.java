package repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import screen.Screen;

class MemoryScreenRepositoryTest {

    MemoryScreenRepository memoryScreenRepository = new MemoryScreenRepository();

    @AfterEach
    void afterEach() {
        memoryScreenRepository.clearRepository();
    }
    @Test
    void save() {
        Screen screen = new Screen(1L);
        Assertions.assertThrows(IllegalStateException.class , () -> {
            memoryScreenRepository.save(screen);
            memoryScreenRepository.save(screen);
        });
    }

    @Test
    void findById() {
        Screen screen = new Screen(1L);
        memoryScreenRepository.save(screen);
        Assertions.assertEquals(screen , memoryScreenRepository.findById(screen.getId()));
    }
}