import java.io.*;
import java.util.*;

public class 뒤집기_1439{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st1 = new StringTokenizer(input, "0");
        StringTokenizer st2 = new StringTokenizer(input, "1");

        // st1, st2에서 각각 0와 1을 기준으로 분리한 그룹의 수 중 작은 것 출력
        System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
    }
}

/*
 * 백준 1439 뒤집기
 * 실버 5
 * 
 * 알고리즘 분류
 * 문자열
 * 그리디 알고리즘
 * 
 * 문제 요약
 * 덩어리를 뒤집어서 더 적게 뒤집는 경우 구하기
 * 
 * 조건
 * 문자열은 100만 이하의 길이
 * 
 * 풀이
 * StringTokenizer 중 1로 구성된 토큰의 수와 0으로 구성된 토큰의 수를 구한다.
 * 더 작은 쪽이 뒤집어야 할 덩어리의 수와 동일하므로 작은 쪽을 출력하면 된다.
 */
