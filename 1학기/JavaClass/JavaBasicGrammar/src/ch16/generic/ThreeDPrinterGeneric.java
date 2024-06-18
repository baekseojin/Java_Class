package ch16.generic;

public class ThreeDPrinterGeneric<T> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "3D 프린터의 재료는 " + material;
    }
}
