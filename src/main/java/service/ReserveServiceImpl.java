package service;

import member.Member;
import repository.MemoryReserveRepository;
import repository.ReserveRepository;
import reserve.Reserve;
import screen.Screen;

import java.util.List;

public class ReserveServiceImpl implements ReserveService {

    @Override
    public void reserveMovie(Member member , Reserve reserve , Screen screen , char row, int column) {
        validateDuplicateReserve(member, reserve);
        validateReservedSeat(screen , row , column);

        ReserveRepository memoryReserveRepository = new MemoryReserveRepository();

        memoryReserveRepository.save(reserve);
    }


    @Override
    public void validateDuplicateReserve(Member member, Reserve reserve) {
        List<Reserve> reserveList = member.getReserveList();
        for (Reserve value : reserveList) {
            if (value.getScreen().getId().equals(reserve.getScreen().getId())) {
                throw new IllegalArgumentException("똑같은 영화를 예매할 수 없습니다.");
            }
        }
    }

    @Override
    public void validateReservedSeat(Screen screen, char row, int column) {
        if (screen.isReservedSeat(row , column)) {
            throw new IllegalArgumentException("이미 예약된 좌석 입니다.");
        }
    }
}
