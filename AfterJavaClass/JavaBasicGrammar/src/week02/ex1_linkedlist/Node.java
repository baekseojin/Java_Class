package week02.ex1_linkedlist;

public class Node {
    private String data;
    public Node next;

    // 생성자
    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
