package ch01;

public class ArrayExam1 { // 교재 24p
    public static void main(String[] args) { // main => public static ~(자동완성)
        int[] a = new int[] { 1,2,3,4,5,6,7,8,9,10 };
        for(int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]); // sout => System.out.println() (자동완성)
        }
    }
}
