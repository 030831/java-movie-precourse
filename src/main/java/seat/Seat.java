package seat;

import grade.Grade;

public class Seat {
    private char row;
    private int column;
    private Grade grade;
    private boolean isReserved;

    public Seat(char row , int column , Grade grade) {
        this.row = row;
        this.column = column;
        this.grade = grade;
        this.isReserved = false;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public int getPrice() {
        return grade.getPrice();
    }

}
