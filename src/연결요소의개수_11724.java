import java.io.*;
import java.util.*;

public class 연결요소의개수_11724{
    static LinkedList<LinkedList<Integer>> list = new LinkedList<>();
    static boolean visited[];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 수
        int m = Integer.parseInt(st.nextToken()); // 간선의 수
        int u, v; // 간선의 양 끝점
        int count = 0; // 연결 요소의 개수
        visited = new boolean[n + 1]; // 방문 여부

        // 1번부터 n개까지 정점 추가
        for(int i = 0; i <= n; i++){
            list.add(new LinkedList<>());
        }

        // 정점에 간선 연결
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            list.get(u).add(v);
            list.get(v).add(u);            
        }

        // 1번 노드부터 6번 노드까지 순회하며 탐색
        for(int i = 1; i <= n; i++){
            if(visited[i] == false){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int startNode){
        for(int i : list.get(startNode)){
            if(visited[i] == true){
                return;
            }

            visited[i] = true;
            dfs(i);
        }
    }
}

/*
 * 백준 11724 연결 요소의 개수
 * 실버 2
 * 
 * 알고리즘 분류
 * 그래프 이론
 * 그래프 탐색
 * 너비 우선 탐색
 * 깊이 우선 탐색
 * 
 * 문제 요약
 * 정점의 수 n, 간선의 수 m, 간선의 양 끝점 u와 v가 주어진다.
 * 연결 요소의 개수를 출력하기
 * 
 * 조건
 * 1 <= n <= 1000
 * 0 <= m <= n*(n - 1) / 2
 * 1 <= u
 * v <= n
 * u != v
 * 간선은 한 번만 주어진다.
 * 
 * 풀이
 * 우선 연결 요소의 개수란 쉽게 말해서 덩어리가 몇 개냐는 말이다.
 * 덩어리가 몇 개인지는 저번에 유기농 배추 문제에서
 * 여러 덩어리를 탐색하는 방법을 이미 활용했었다.
 * 그 때는 2차원 배열을 순회하면서
 * 배추가 있고, 방문하지 않았던 노드라면
 * 노드에서 상하좌우로 탐색을 진행해 필요한 지렁이의 수를 알아냈었다.
 * 여기에서 본다면 연결 요소는 몇 개일까?
 * 유기농 배추 문제에서 제시된 표에서는 덩어리(지렁이)가 모두 5개였다.
 * 즉, 메인 함수에서 dfs()가 몇 번이냐 실행되는지를 알아내면 문제를 풀 수 있다.
 * 
 * 그럼 다음 문제이다. 어떻게 코드를 짜야 dfs를 몇 번이나 실행하는지 알아낼 수 있을까?
 * 1번 정점부터 n번 정점까지 모두 방문해서 간선을 통한 노드 탐색을 실행한다.
 * 만약 방문하지 않았던 노드가 있다면, dfs 함수를 실행하고 연결 요소 수를 1 증가시키면 된다.
 */