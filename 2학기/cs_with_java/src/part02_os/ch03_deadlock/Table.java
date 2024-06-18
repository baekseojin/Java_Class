package part02_os.ch03_deadlock;

import java.util.ArrayList;

public class Table {
    static ArrayList<Fork> forks = new ArrayList<>(); // static 영역에 보관, 공유해서 사용
    static {
        forks.add(new Fork()); // 0번방 포크
        forks.add(new Fork()); // 1번방 포크
        forks.add(new Fork()); // 2번방 포크
        forks.add(new Fork()); // 3번방 포크
    }
}
