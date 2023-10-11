import java.io.*;
import java.util.*;

public class ATM_11399{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int al[] = new int[testCase];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i = 0; i < testCase; i++){
            al[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(al);

        long result = 0;

        for(int i = 0; i < al.length; i++){
            for(int j = 0; j <= i; j++){
                result += al[j];
            }
        }

        System.out.println(result);
    }
}

/*
 * 백준 11399 ATM
 * 실버 4
 * 
 * 분류
 * 그리디 알고리즘
 * 정렬
 * 
 * 문제 요약
 * 줄 선 사람의 수 n과 각 사람이 돈을 인출하는 데 걸리는 시간 pi가 주어졌을 때,
 * 각 사람이 돈을 인출하는 데 필요한 시간의 합의 최솟값 구하기
 * 
 * 조건
 * n과 pi는 1 ~ 1000의 범위를 가진다.
 * 
 * 풀이
 * 돈을 인출하는 데 필요한 최솟값은 그냥 정렬하면 된다.
 * 이후 1 2 3 3 4로 정렬된 배열을
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 3
 * 1 2 3 3 4
 * 이렇게 더해야 하므로 2중 for문을 사용하여 구현하면 끝난다.
 * 별 찍기를 기억하면 좋은 힌트가 된다.
 * 
 */
