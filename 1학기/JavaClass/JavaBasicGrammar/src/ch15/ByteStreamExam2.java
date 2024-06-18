package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class ByteStreamExam2 {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);

        int a;
        try {
            while ((a = bi.read()) != -1) {
                bo.write(a);
            }
            bo.flush(); // 버퍼 비우기
        } catch (Exception e) {

        }
    }


}
