package ch16.generic2;

public class ThreeDPrinter<T extends Material> {
    // 타입을 지정할 수 있고 타입을 우리 입맛에 맞게끔 제한을 줄 수 있다, 물질이라는 클래스를 상속받았기 때문에 재료만 줄 수 있다.
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
