import java.io.*;
import java.util.*;

public class 소수_1312{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String input = br.readLine();
        st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int result = a % b;

        for(int i = 0; i < n - 1; i++){
            result *= 10;
            result %= b;
        }

        result *= 10;

        System.out.println(result / b);
    }
}

/*
 * 백준 1312 소수
 * 실버 5
 * 
 * 알고리즘 분류
 * 수학
 * 
 * 문제 요약
 * 소숫점 아래 n번째 수 구하기
 * 
 * 조건
 * 1 <= a, b <= 100,000
 * 1 <= n <= 1,000,000
 * 
 * 풀이
 * 최대 소숫점 백만 번째 자리를 구해야 한다.
 * 일반적인 double 나누기로는 불가능하다.
 * 
 * 1. 정수 영역의 나머지를 구한다.
 * 2. 구한 나머지에서 10을 곱해 다음 나머지를 구한다.
 * 3. n - 1번째까지 반복한 뒤 다시 한 번 10을 곱하고, 그 몫을 구하면 된다.
 */