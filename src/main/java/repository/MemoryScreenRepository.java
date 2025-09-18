package repository;

import screen.Screen;

import java.util.HashMap;
import java.util.Map;

public class MemoryScreenRepository implements ScreenRepository {

    private static final Map<Long , Screen> screenRepository = new HashMap<>();

    @Override
    public void save(Screen screen) {
        if (screenRepository.containsKey(screen.getId())) {
            throw new IllegalStateException("이미 존재하는 id 입니다.");
        }

        screenRepository.put(screen.getId() , screen);
    }

    @Override
    public Screen findById(Long id) {
        return screenRepository.get(id);
    }

    public void clearRepository() {
        screenRepository.clear();
    }
}
