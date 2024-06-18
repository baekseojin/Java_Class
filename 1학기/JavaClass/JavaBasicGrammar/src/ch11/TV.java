package ch11;

public class TV implements Sound {
    // implements : 구현한다(인터페이스를)

    private int soundLevel;
    @Override
    public void soundUp() {
        soundLevel++;
    }

    @Override
    public void soundDown() {
        if(soundLevel == 0) {
            return ;
        }
        soundLevel--;
    }

    public void showInfo() {
        System.out.println("티비의 현재 음량은 " + soundLevel + "입니다.");
    }

}
