import java.io.*;

public class 거스름돈_14916{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[100001];
        array[0] = 0;
        array[1] = -1;
        array[2] = 1;
        array[3] = -1;
        array[4] = 2;
        array[5] = 1;

        int input = Integer.parseInt(br.readLine());

        for(int i = 6; i <= input; i++){
            if(i % 5 == 0){
                array[i] = array[i - 5] + 1;
            }
            else{
                array[i] = array[i - 2] + 1;
            }
        }

        System.out.println(array[input]);
    }
}

/*
 * 백준 14916 거스름돈
 * 실버 5
 * 
 * 알고리즘 분류
 * 수학
 * 다이나믹 프로그래밍
 * 그리디 알고리즘
 * 
 * 문제 요약
 * 2원짜리와 5원짜리 거스름돈이 있다.
 * 동전의 개수가 최소가 되도록 돈 거슬러 주기
 * 
 * 조건
 * 거스름돈의 액수 1 <= n <= 100,000
 * 거슬러 줄 수 없으면 -1 출력
 * 
 * 풀이
 * 4원  2
 * 5원  1
 * 6원  3
 * 7원  2
 * 8원  4
 * 9원  3
 * 10원 2
 * 11원 4
 * 12원 3
 * 
 * i번째 = (i - 2번째 값) + 1
 * 위 공식이 성립된다.
 * 만약 i가 5로 나누어떨어진다면 (i - 5번째 값) + 1
 * 이 된다.
 * 
 * 1 ~ 5번째는 규칙이 없으니 직접 입력해주고
 * 나머지는 for문을 이용해 식을 구성해주면 끝난다.
 */