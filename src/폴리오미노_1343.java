import java.io.*;

public class 폴리오미노_1343{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String a = br.readLine();
        a = a.replaceAll("XXXX", "AAAA");
        a = a.replaceAll("XX", "BB");

        if(a.contains("X")){
            System.out.println(-1);
        }
        else{
            System.out.println(a);
        }
    }
}

/*
 * 백준 1343 폴리오미노
 * 실버 5
 * 
 * 알고리즘 분류
 * 구현
 * 그리디 알고리즘
 * 
 * 문제 요약
 * .와 X로 이루어진 보드판이 주어졌을 때, AAAA와 BB로 변환하기
 * 
 * 조건
 * 보드판의 크기는 최대 50
 * 덮을 수 없으면 -1 출력
 * .는 변환하지 않는다.
 * 
 * 풀이
 * 주어진 입력 중 "XXXX"가 있다면 "AAAA"로 replaceAll한다.
 * 그 다음 "XX"가 있다면 "BB"로 replaceAll한다.
 * XXXX가 먼저 변환되어야 하고 나중에 남은 XX를 변환해야 하므로 순서에 유의한다.
 * X가 남아있다면 변환이 불가능한 것이니 -1 출력한다.
 */