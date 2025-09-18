package grade;

public enum Grade {
    S(18000),
    A(15000),
    B(12000);

    private final int price;

    Grade(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
