package movieTheater;

import date.Date;
import member.Member;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private Long id;
    private String name;
    private String director;
    private int runTime; // 단위 : 분
    private int seatColumnSize;
    private int seatRowSize;
    private List<List<Seat>> seat = new ArrayList<>();
    private Date startTime;
    private Date endTime;

    public Movie(Long id, String name, String director, int runTime, int seatColumnSize, int seatRowSize, Seat[][] seat, Date startTime, Date endTime) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.runTime = runTime;
        this.seatColumnSize = seatColumnSize;
        this.seatRowSize = seatRowSize;
        this.startTime = startTime;
        this.endTime = endTime;

        for (int i = 0 ; i < seatRowSize ; i++) {
            this.seat.add(new ArrayList<>());
            for (int j = 0 ; j < seatColumnSize ; j++) {
                this.seat.get(i).add(new Seat(Grade.B , (char) (i+'A'), j ));
            }
        }
    }

    public boolean isReservedSeat(int column , char row) {
        return seat.get(row-'A').get(column).isReserved();
    }

    public boolean isReservedMember(Member member) {
        for (int i = 0 ; i < seatRowSize ; i++) {
            for (int j = 0 ; j < seatColumnSize ; j++) {
                if (seat.get(i).get(j).getId() == member.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getSeatPrice(char seatRow , int seatColumn) {
        return seat.get(seatRow-'A').get(seatColumn).getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getSeatColumnSize() {
        return seatColumnSize;
    }

    public void setSeatColumnSize(int seatColumnSize) {
        this.seatColumnSize = seatColumnSize;
    }

    public int getSeatRowSize() {
        return seatRowSize;
    }

    public void setSeatRowSize(int seatRowSize) {
        this.seatRowSize = seatRowSize;
    }

    public List<List<Seat>> getSeat() {
        return seat;
    }

    public void setSeat(List<List<Seat>> seat) {
        this.seat = seat;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
