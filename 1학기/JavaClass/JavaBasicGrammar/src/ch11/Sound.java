package ch11;

public interface Sound {
    // 인터페이스는 생성을 할 수 없다(Sound sound = new sound(); 불가능)
    // 생성은 못하지만 정의를 할 수 있다
    // 인터페이스는 추상화보다 조금 더 강제적인 친구다


    public void soundUp();
    public void soundDown();
    // sound 인터페이스를 상속받으면 무조건 soundUp()과 soundDown()을 구현해야 한다


}
