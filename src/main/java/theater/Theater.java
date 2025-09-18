package theater;

import screen.Screen;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private Long id;
    private String name;
    private String location;
    private String rowSize;
    private Long columnSize;
    private List<Screen> screenList;


    public Theater(Long id) {
        this.id = id;
        this.screenList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }
}
