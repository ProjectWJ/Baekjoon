import java.io.*;

public class 한수{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int count = 99;

        if(n < 100){
            System.out.println(n);
            return;
        }

        for(int i = 100; i <= n; i++){
            String input[] = new String(Integer.toString(i)).split("");
            int commonDifference = Integer.parseInt(input[0]) - Integer.parseInt(input[1]);

            for(int j = 1; j < input.length - 1; j++){
                int temp1 = Integer.parseInt(input[j]);
                int temp2 = Integer.parseInt(input[j + 1]);

                if(temp1 - commonDifference == temp2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/*
 * 백준 1065 한수
 * 실버 4
 * 
 * 알고리즘 분류
 * 수학
 * 브루트포스 알고리즘
 * 
 * 문제 요약
 * 어떤 양의 정수 x의 각 자리가 등차수열을 이루는 수를 한수라고 부르기로 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * n이 주어졌을 때 1 이상 n 이하의 한수의 수 출력하기
 * 
 * 조건
 * 1 <= n <= 1,000
 * 
 * 풀이
 * 1 ~ 99까지의 수는 모두 한수이므로 셈하지 않고 즉시 출력한다.
 * ex) 1은 공차가 0인 등차수열(예제 2번 참조하여 등차수열이라 판단), 10은 공차가 -1인 등차수열,
 *     11은 공차가 0인 등차수열, 92는 공차가 -7인 등차수열....
 * 
 * 100부터 n까지 수가 입력되면 셈하도록 한다.
 * 먼저, 첫 번째와 두 번째 자릿수를 빼어 공차를 구한다.
 * 이후 두 번째부터 마지막 자릿수까지 공차를 이용해 점검하여 판단한다.
 * j번째 자릿수에서 공차를 빼었을 때, j + 1번째 자릿수와 동일하다면 한수인 것으로 판단한다.
 * 
 * 다만 이 방법은 n이 4자릿수 이상의 수일 때는 올바르게 검사하지 못한다.
 * 만약 n이 1000를 넘어서는 범위를 판단해야 한다면, 마지막 자릿수까지 검사하고 정상 통과되었을 때 count++하도록 수정한다.
 * 
 */