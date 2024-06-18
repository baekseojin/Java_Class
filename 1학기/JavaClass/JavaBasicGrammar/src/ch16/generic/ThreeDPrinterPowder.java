package ch16.generic;

public class ThreeDPrinterPowder {
    private Powder material;

    public void setMaterial(Powder material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "3d프린터 (파우더) 의 재료는 " + material + "입니다.";
    }
}
