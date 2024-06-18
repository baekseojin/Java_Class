package ch13.bank;

public class BankOfKorea {
    private static BankOfKorea instance = new BankOfKorea();
    private float baseRate;

    private BankOfKorea() {
    }

    public static BankOfKorea getInstance() {
        if (instance == null) {
            instance = new BankOfKorea();
        }
        return instance;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
        WooriBank.setRate(baseRate);
        KakaoBank.setRate(baseRate);
    }
}

//package ch13.bank;
//
//public class BankOfKorea {
//    // 싱글톤 패턴 : 객체를 미리 생성해놓고
//    private static BankOfKorea instance = new BankOfKorea(); // 스태틱 영역에 미리 공간을 할당받음
//    private float baseRate; // 기준금리
//
//    private BankOfKorea() { // 디폴트 생성자를 private로 바꿈 -> 외부에서 생성 불가능
//
//    }
//
//    public static BankOfKorea getInstance() {
//        if(instance == null) {
//            instance = new BankOfKorea();
//        }
//
//        return instance; // 위에서 미리 생성해놓은 객체(instance)를 return
//    }
//
//    // alt + insert로 getter, setter 만들기
//    public float getBaseRate() {
//        return baseRate;
//    }
//
//    public void setBaseRate(float baseRate) {
//        this.baseRate = baseRate;
//        WooriBank.setRate(baseRate); // 우리은행의 기준 금리는 시중의 금리에 따라서 변동이 되기 때문에 시중의 금리가 바뀌면 우리은행 금리가 바뀐다
//        KakaoBank.setRate(baseRate); // 카뱅의 기준 금리는 시중의 금리에 따라서 변동이 되기 때문에 시중의 금리가 바뀌면 카뱅 금리가 바뀐다
//    }
//}
