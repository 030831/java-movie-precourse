package movieTheater;

public class Seat {
    private Grade grade;
    private int column;
    private char row;
    private int id;
    private int price;


    public Seat(Grade grade,char row, int column) {
        this.grade = grade;
        this.row = row;
        this.column = column;
        this.id = 0;

        if (grade == Grade.S) {
            this.price = 18000;
        }
        if (grade == Grade.A) {
            this.price = 15000;
        }
        if (grade == Grade.B) {
            this.price = 12000;
        }
    }

    public boolean isReserved() {
        return id != 0;
    }
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
