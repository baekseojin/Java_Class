//package part01_structure.ch02_BST;
//
//
//// BST : Binary Search Tree (이진 탐색 트리)
//public class BST implements BSTInterface {
//
//    MyNode root;
//
//    int count;
//
//
//    @Override
//    public void add(Integer value) {
//        MyNode newNode = new MyNode(value);
//        if(count == 0) {
//            root = newNode;
//            count++;
//            return ;
//        }
//
//        MyNode temp = root;
//
//        while(true) {
//            if(temp.value < newNode.value) { // 새로 들어오는 노드가 루트보다 값이 크면
//                if(temp.right == null) { // 만약 오른쪽이 비어있다면
//                    // 추가
//                    temp.right = newNode;
//                    break;
//                }
//                temp = temp.right; // 오른쪽이 비어있지 않으니 temp를 바꿈
//            }
//            if(temp.value > newNode.value) { // 새로 들어오는 노드가 루트보다 값이 작으면
//                if(temp.left == null) {
//                    temp.left = newNode;
//                    break;
//                }
//                temp = temp.left;
//            }
//        }
//        count++;
//    }
//
//    @Override
//    public Integer remove(Integer value) {
//
//        // 삭제 노드 탐색
//        MyNode pre = null;
//        MyNode temp;
//        // MyNode temp = root;
//        // 탐색
//        while(value != temp.value) {
//            // 값 비교
//            if(value > temp.value) {
//                pre = temp;
//                temp = temp.right;
//            } else {
//                pre = temp;
//                temp = temp.left;
//            }
//
//            if(temp == null) {
//                System.out.println("찾고자하는 값이 없습니다.");
//                return null;
//            }
//        }
//
//        // 해당 노드를 찾았다.
//
//        // 1. 자식 노드가 없을 때
//        if(temp.left == null && temp.right == null) {
//            // 1-1. 해당 노드가 루트냐?
//            if(temp == root) {
//                root = null;
//            } else if(pre.right == temp) {
//                pre.right = null;
//            } else {
//                pre.left = null;
//            }
//        }
//
//
//    }
//
//    @Override
//    public MyNode getRoot()3 {
//        return null;
//    }
//
//    @Override
//    public void preOrder(MyNode node) {
//
//    }
//
//    @Override
//    public void inOrder(MyNode node) {
//
//    }
//
//    @Override
//    public void postOrder(MyNode node) {
//
//    }
//}
