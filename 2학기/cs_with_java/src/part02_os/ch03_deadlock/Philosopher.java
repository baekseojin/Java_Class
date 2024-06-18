package part02_os.ch03_deadlock;

public class Philosopher extends Thread {

    private String name;

    private int number;

    public Philosopher(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void takeFork(int num) {
        Fork fork = Table.forks.get(number);
        fork.useFork();
        System.out.println(name + " take a " + number + "fork");
    }
    public void putFork(int number) {
        Fork fork = Table.forks.get(number);
        fork.useFork();
        System.out.println(name + " put down " + number + "fork");
    }

    @Override
    public void run() {
        // 1. 랜덤 시간 대기
        int randTime = (int) ((Math.random() * 1000) + 500);
        try {
            System.out.println(name + " : " + randTime + "ms wait");
            Thread.sleep(randTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 2. 왼쪽 포크 쥐기
        takeFork(number);
        
        // 3. 오른쪽 포크 쥐기 & 먹기
        takeFork((number-1) % 4);
        System.out.println("yam yam");

        // 4. 포크 내려놓기
        putFork(number);
        putFork((number+1) % 4);
        super.run();
    }
}
