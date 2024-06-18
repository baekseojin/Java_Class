package week02.ex1_linkedlist;

public class LinkedList implements List {
    private Node head;
    private int count;

    @Override
    public Node add(String data) {
        Node newNode = new Node(data); // 노드 생성
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head; // head의 역할을 대신해주는 temp 변수 생성, head가 움직이면 안되기 때문에
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++; // 노드가 몇 개 생겼는지 알 수 있다
        return newNode;
    }

    @Override
    public Node remove(int position) {
        Node temp = head; // 위치 찾아갈 때 무조건 temp가 필요함
        if(position < 0 || position > count) {
            System.out.println("위치 오류!!! 현재 노드 개수는 " + count + "개 입니다.");
            return null;
        }
        if(position==0) {
            head = head.next;
        } else {
            Node preNode = head; // head;
            for(int i=0; i<position; i++) {
                preNode = temp;
                temp = temp.next;
            }
            preNode.next = temp.next;
        }
        count++;
        return temp;

    }

    @Override
    public Node insert(String data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        if(position < 0 || position > count) {
            System.out.println("위치 오류!!! 현재 노드 수는 " + count + "개 입니다.");
            return null;
        }
        if(position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for(int i=0; i<position-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        count++;
        return newNode;
    }

    @Override
    public void printAll() {
        if(head == null) {
            System.out.println("노드가 하나도 없습니다.");
        } else {
            Node temp = head; // head의 역할을 대신하는 temp 변수
            while(temp != null) {
                System.out.print(temp.getData());
                temp = temp.next;
                if(temp != null) {
                    System.out.print("->");
                }
            }
            System.out.println();
        }
    }

    @Override
    public Node getElement(int position) {
        if(head == null) {
            System.out.println("노드가 비어있습니다.");
            return null;
        } else {
            Node temp = head;
            for(int i=0; i<position; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
//        if(head == null) {
//            return ture;
//        }
        return head == null;
    }
}
