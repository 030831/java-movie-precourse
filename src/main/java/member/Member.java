package member;

import reserve.Reserve;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private Long id;
    private String name;
    private List<Reserve> reserveList;

    public Member(Long id , String name) {
        this.id = id;
        this.name = name;
        reserveList = new ArrayList<>();
    }
    public List<Reserve> getReserveList() {
        return reserveList;
    }

    public void addReserveList(Reserve reserve) {
        this.reserveList.add(reserve);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
