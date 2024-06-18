package week03.q1;

public class UpgradeCalculator extends Calculator {

    public void minus(int value) {
        int result = getValue() - value;
        setValue(result);
    }

}
