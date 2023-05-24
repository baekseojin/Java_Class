package week02.ex1_linkedlist;

public interface List {
    // 인터페이스는 선언만 하는 곳이다 (중괄호 사용 X)
    Node add(String data) ;

    Node remove(int position); // position 매개변수 : 몇 번째 노드를 삭제할래?

    Node insert(String data, int position); // 해당 번지에 노드 삽입

    void printAll();

    Node getElement(int position); // 해당 위치의 노드를 가지고 오는 메서드

    int getSize();
    
    boolean isEmpty(); // 노드가 있냐 없냐 테스트
}
