package week02.ex1_linkedlist;

import week02.ex1_linkedlist.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // 1. linkedlist 생성
        LinkedList list = new LinkedList();

        // 2. 생성된 list에 값 추가
        list.add("A");
        list.add("B");
        list.add("C");

        // 3. list의 값 출력
        list.printAll();

        // 4. insert
        list.insert("D", 2);
        list.printAll();

        // 5. remove
        list.remove(1);
        list.printAll();

        // 6. getElemnent : 위치값 찾아가기
        System.out.println((list.getElement(1).getData()));;
        System.out.println(list.getSize());

        // 7. isEmpty
        System.out.println(list.isEmpty());

    }
}
