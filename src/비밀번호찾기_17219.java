import java.io.*;
import java.util.*;

public class 비밀번호찾기{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, String> pw = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            pw.put(st.nextToken(), st.nextToken());
        }

        for(int i = 0; i < m; i++){
            sb.append(pw.get(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
}

/*
 * 백준 17219 비밀번호 찾기
 * 실버 4
 * 
 * 알고리즘 분류
 * 자료 구조
 * 해시를 사용한 집합과 맵
 * 
 * 문제 요약
 * 주어진 입력에서 비밀번호를 찾기
 * 
 * 조건
 * 1 <= n, m <= 100,000
 * 비밀전호의 최대 길이는 20자
 * 
 * 풀이
 * 중복을 허용하지 않고 키와 값을 갖는 Map을 사용하면 쉽게 해결할 수 있다.
 */