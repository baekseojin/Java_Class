package part01_structure.ch01_CBT;

import java.util.LinkedList;
import java.util.Queue;

// CBT : Complete Binary Tree (완전 이진 트리)
public class CBT implements CBTInterface { // complete binary tree

    MyNode root;
    int count;

    @Override
    public void push(Integer value) {
        MyNode newNode = new MyNode(value);

        if(count == 0) {
            root = newNode;
            count++;
            return;
        }

        // 위치 찾음

        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp;

        while(true) {
            temp = queue.poll();

            // 왼쪽 자식 비었냐?
            if(temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            // 오른쪽 자식 비었냐?
            if(temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }

        }

        count++;
    }

    @Override
    public Integer pop() {
        if(count == 0) {
            System.out.println("트리가 비어 있습니다.");
            return null; // 반환형이 참조형이라 return null 가능
        } else if(count == 1) {
            int n = root.value;
            root = null;
            count--;
            return n;
        }

        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp = null;
        MyNode pre = null; // 부모 노드를 가리킴

        while(!queue.isEmpty()) {
            temp = queue.poll(); //

            // 왼쪽 자식 확인

            if(temp.left != null) {
                pre = temp;
                queue.add(temp.left);
            }

            // 오른쪽 자식 확인

            if(temp.right != null) {
                pre = temp;
                queue.add(temp.right);
            }
        }

        if(pre.left.equals(temp)) {
            pre.left = null;
        }
        else {
            pre.right = null;
        }

        count--;

        return temp.value;
    }

    @Override
    public MyNode getRoot() {
        return root;
    }

    @Override
    public void bfs(MyNode node) {
        if(count == 0) {
            System.out.println("트리가 비어 있습니다.");
            return ; // 반환형이 참조형이라 return null 가능
        } else if(count == 1) {
            int n = root.value;
            System.out.println(n);
            return ;
        }

        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.println(root.value);
        MyNode temp = null;
        MyNode pre = null; // 부모 노드를 가리킴

        while(!queue.isEmpty()) {
            temp = queue.poll(); //

            // 왼쪽 자식 확인

            if(temp.left != null) {
                System.out.println(temp.left.value);
                queue.add(temp.left);
            }

            // 오른쪽 자식 확인

            if(temp.right != null) {
                System.out.println(temp.right.value);
                queue.add(temp.right);
            }
        }
    }

    @Override
    public void dfs(MyNode node) {
        if(count == 0) {
            System.out.println("트리가 비어 있습니다.");
            return ;
        }

        if(node != null) {
            dfs(node.left);
            dfs(node.right);
            System.out.print(node.value + " ");
        }

    }
}
