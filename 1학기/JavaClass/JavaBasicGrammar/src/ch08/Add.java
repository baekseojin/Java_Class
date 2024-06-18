package ch08;

public class Add {
    public int sum(int n1, int n2) { // 메서드 오버로딩 : 사용자 편의성을 위해서 사용(다 만들어놨으니까 니가 원하는거 써)
        return n1 + n2;
    }

    public String sum(String s1, String s2) { // 메서드 오버로딩
        return s1 + s2;
    }
}
