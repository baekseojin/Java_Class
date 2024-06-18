package ch16.generic;

public class ThreeDPrinterExam {
    public static void main(String[] args) {
        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        ThreeDPrinterPowder threeDPrinterPowder = new ThreeDPrinterPowder();
        threeDPrinterPowder.setMaterial(powder);
        System.out.println(threeDPrinterPowder);

        ThreeDPrinterObject threeDPrinterObject = new ThreeDPrinterObject();
        threeDPrinterObject.setMaterial(powder);
        threeDPrinterObject.setMaterial(plastic);

        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        threeDPrinterGeneric.setMaterial(plastic);
        System.out.println(threeDPrinterGeneric);

    }
}
