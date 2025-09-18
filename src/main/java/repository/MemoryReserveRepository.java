package repository;

import reserve.Reserve;

import java.util.HashMap;
import java.util.Map;

public class MemoryReserveRepository implements ReserveRepository {

    private static final Map<Long , Reserve> reserveRepository = new HashMap<>();

    @Override
    public void save(Reserve reserve) {
        if (reserveRepository.containsKey(reserve.getId())) {
            throw new IllegalStateException("이미 존재하는 id 입니다.");
        }

        reserveRepository.put(reserve.getId() , reserve);
    }

    @Override
    public Reserve findById(Long id) {
        return reserveRepository.get(id);
    }

    public void clearRepository() {
        reserveRepository.clear();
    }

}
