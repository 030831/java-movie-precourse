package screen;

import grade.Grade;
import movie.Movie;
import reserve.Reserve;
import seat.Seat;
import theater.Theater;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Screen {
    private Long id;
    private Movie movie;
    private Theater theater;
    private LocalDateTime date;
    private List<List<Seat>> seatList;
    private int rowSize;
    private int columnSize;
    private List<Reserve> reserveList;


    public Screen(Long id) {
        this.id = id;
        this.reserveList = new ArrayList<>();
    }

    public Screen(Long id , int rowSize , int columnSize) {
        this.id = id;
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.seatList = new ArrayList<>();

        for (int i = 0 ; i < this.rowSize ; i++) {
            List<Seat> row = new ArrayList<>();
            for (int j = 0 ; j < this.columnSize ; j++) {
                row.add(new Seat((char) ('A' + i), j , Grade.B));
            }
            this.seatList.add(row);
        }
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public Long getId() {
        return id;
    }


    public List<List<Seat>> getSeatList() {
        return seatList;
    }


    public boolean isReservedSeat(char row, int column) {

        return seatList.get(row-'A').get(column).isReserved();
    }
}
