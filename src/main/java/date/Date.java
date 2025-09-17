package date;

public class Date {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;


    public Date(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public static boolean isLater(Date actual , Date expected) {
        if (actual.getYear() > expected.getYear() &&
                actual.getMonth() > expected.getMonth() &&
                actual.getDay() > expected.getDay() &&
                actual.getHour() > expected.getHour() &&
                actual.getMinute() > expected.getMinute()) {
            return true;
        }

        return false;
    }

    public static boolean isTimeOverlap(Date firstStartTime , Date firstEndTime , Date secondStartTime , Date secondEndTime) {

        if (Date.isLater(secondStartTime , firstEndTime) || Date.isLater(firstStartTime , secondEndTime)) {
            return false; // 겹치지 않는 조건.
        }

        return true;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
