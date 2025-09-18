package repository;

import theater.Theater;

import java.util.HashMap;
import java.util.Map;

public class MemoryTheaterRepository implements TheaterRepository {

    Map<Long , Theater> theaterRepository = new HashMap<>();

    @Override
    public void save(Theater theater) {
        if (theaterRepository.containsKey(theater.getId())) {
            throw new IllegalStateException("이미 존재하는 id 입니다.");
        }

        theaterRepository.put(theater.getId() , theater);
    }

    @Override
    public Theater findById(Long id) {
        return theaterRepository.get(id);
    }

    public void clearRepository() {
        theaterRepository.clear();
    }
}
