package repository;

import screen.Screen;

public interface ScreenRepository {
    void save(Screen screen);
    Screen findById(Long id);
}
