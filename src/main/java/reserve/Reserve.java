package reserve;

import member.Member;
import screen.Screen;

import java.time.LocalDateTime;

public class Reserve {
    private Long id;
    private Member member;
    private Screen screen;
    private LocalDateTime date;
    private String row;
    private String column;

    public Reserve(Long id) {
        this.id = id;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Long getId() {
        return id;
    }

    public Screen getScreen() {
        return screen;
    }


}
