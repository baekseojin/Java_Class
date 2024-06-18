package part01_structure.ch01_CBT;

public class CBTTest {
    public static void main(String[] args) {
        CBT cbt = new CBT();

        cbt.push(1);
        cbt.push(2);
        cbt.push(3);
        cbt.push(4);
        cbt.push(5);
        cbt.push(6);

        // cbt.bfs(cbt.getRoot()); // 너비 우선 탐색 = 10 5 1 12 14 7
        cbt.dfs(cbt.getRoot()); // 깊이 우선 탐색 = 12 14 5 7 1 10

        cbt.pop();
        cbt.pop();
        System.out.println();

        cbt.dfs(cbt.getRoot());


    }
}
