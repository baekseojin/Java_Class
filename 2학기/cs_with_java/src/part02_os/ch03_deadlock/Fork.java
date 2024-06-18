package part02_os.ch03_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    Lock lock = new ReentrantLock();

    public void useFork() {
        lock.lock(); // 상호 배제 구현
    }

    public void unUseFork() {
        lock.unlock();
    }

}
