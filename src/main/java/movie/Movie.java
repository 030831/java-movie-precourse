package movie;

import screen.Screen;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private Long id;
    private String name;
    private List<Screen> screenList;

    public Movie(Long id , String name) {
        this.id = id;
        this.name = name;
        screenList = new ArrayList<>();
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void addScreenList(Screen screen) {
        this.screenList.add(screen);
    }


    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
