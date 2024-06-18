package part01_structure.ch01_CBT;

public interface CBTInterface {

    void push(Integer value);

    Integer pop();

    MyNode getRoot();

    // 탐색

    void bfs(MyNode node); // 너비 우선 탐색

    void dfs(MyNode node); // 깊이 우선 탐색
}
