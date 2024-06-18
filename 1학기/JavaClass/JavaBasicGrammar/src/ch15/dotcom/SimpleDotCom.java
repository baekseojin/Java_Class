package ch15.dotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    ArrayList<Integer> location; // 위치를 저장
    int numOfHits;

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss"; // 기본값을 miss로 준다
        int index = location.indexOf(guess); // 몇 번째 index인지 return한다
        if(index >= 0) {
            location.remove(index);
            if(location.isEmpty()) {
                result = "kill";
            }
            else {
                result = "hit";
            }
        }
        return result;
    }

//    public String checkYourself(String guessStr) {
//        int guess = Integer.parseInt(guessStr); // 형변환
//        String result = "miss";
//
//
//        // itar
//        for(int i: location) {
//            if(guess == i) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//        if(numOfHits == location.length) {
//            result ="kill";
//        }
//
//        return result;
//    }

}
