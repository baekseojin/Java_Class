package week03.ex02_queue;

public class MyQueueExam {
    public static void main(String[] args) {
        // 1. 스택 생성
        MyQueue myQueue = new MyQueue();

        // 2. 값 추가 : A, B, C
        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");
        myQueue.printAll();

        System.out.println(myQueue.deQueue() + "삭제");
        myQueue.printAll();

        System.out.println(myQueue.getElement(0).getData());


    }
}
