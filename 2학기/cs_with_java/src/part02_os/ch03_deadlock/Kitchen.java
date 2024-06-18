package part02_os.ch03_deadlock;

public class Kitchen { // 식사하는 철학자 문제 구현
    public static void main(String[] args) {
        Philosopher aristotle = new Philosopher("aristotle", 0); // 아리스토텔레스 철학자 생성
        Philosopher socrates = new Philosopher("socrates", 1); // 소크라테스 철학자 생성
        Philosopher plato = new Philosopher("plato", 2); // 플라톤 철학자 생성
        Philosopher pythagoras = new Philosopher("pythagoras", 0); // 피타고라스 철학자 생성

        aristotle.start();
        socrates.start();
        plato.start();
        pythagoras.start();
    }
}
