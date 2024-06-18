package ch11;

public class Radio implements Sound { // 에러 뜨면 오버라이드 하자

    private int soundLevel;
    @Override
    public void soundUp() {
        soundLevel += 2;
    }

    @Override
    public void soundDown() {
        soundLevel -= 2;
    }

}
