package part02_os.ch01_Thread;

public class ThreadAsc extends Thread {
    private int num;

    public ThreadAsc(int num) {
        this.num = num;
    }
}
