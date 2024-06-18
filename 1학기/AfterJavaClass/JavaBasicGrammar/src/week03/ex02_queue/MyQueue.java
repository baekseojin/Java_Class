package week03.ex02_queue;

import week02.ex1_linkedlist.LinkedList;
import week02.ex1_linkedlist.Node;


public class MyQueue extends LinkedList implements IQueue{
    private Node front, rear;

    @Override
    public void enQueue(String data) {
        Node newNode;
        if(isEmpty()) {
            newNode = add(data);
            front = newNode;
            rear = newNode;
        }
        else {
            newNode = add(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " add");
    }

    @Override
    public String deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        String data = remove(0).getData();
        front = front.next;
        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return ;
        }
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}