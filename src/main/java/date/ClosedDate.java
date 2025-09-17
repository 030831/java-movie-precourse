package date;

public class ClosedDate {

    private Date closureStartTime;
    private Date closureEndTime;

    public ClosedDate(Date closureStartTime, Date closureEndTime) {
        this.closureStartTime = closureStartTime;
        this.closureEndTime = closureEndTime;
    }

    public static boolean isEqualTo(ClosedDate actual , ClosedDate expected) {
        return actual.closureStartTime == expected.closureStartTime &&
                actual.closureEndTime == expected.closureEndTime;
    }

    public Date getClosureStartTime() {
        return closureStartTime;
    }

    public void setClosureStartTime(Date closureStartTime) {
        this.closureStartTime = closureStartTime;
    }

    public Date getClosureEndTime() {
        return closureEndTime;
    }

    public void setClosureEndTime(Date closureEndTime) {
        this.closureEndTime = closureEndTime;
    }
}
