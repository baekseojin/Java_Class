package ch15;

import java.io.IOException;

import static java.lang.System.*;

public class StreamExam {
    public static void main(String[] args) throws IOException {
        int a;
        try {
            a = System.in.read(); // return 타입이 int
            System.out.println((char) a);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
}
