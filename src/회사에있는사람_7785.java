import java.io.*;
import java.util.*;

public class 회사에있는사람_7785{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> hs = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String input[] = br.readLine().split(" ");

            if(input[1].equals("enter")){
                hs.add(input[0]);
            }
            else{
                hs.remove(input[0]);
            }
        }

        String ps[] = hs.toArray(new String[hs.size()]);
        Arrays.sort(ps, Collections.reverseOrder());

        for(int i = 0; i < ps.length; i++){
            sb.append(ps[i]).append('\n');
        }

        System.out.println(sb);
    }
}

/*
 * 백준 7785 회사에 있는 사람
 * 실버 5
 * 
 * 알고리즘 분류
 * 자료 구조
 * 해시를 사용한 집합과 맵
 * 
 * 문제 요약
 * 회사에 현재 남아있는 사람 내림차순으로 출력하기
 * 
 * 조건
 * 2 <= n <= 10^6
 * 
 * 풀이
 * 1. Set을 만들어 enter, leave에 따라 삽입, 삭제를 수행한다.
 * 2. 내림차순 정렬이 필요하므로 Set을 Array로 변환 및 저장한다.
 * 3. 내림차순 정렬을 수행한 후 StringBuilder에 담아 출력하면 끝
 */