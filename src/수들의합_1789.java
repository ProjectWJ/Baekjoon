import java.io.*;

public class 수들의합_1789{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());
        long n = 0;
        long sum = 0;

        while(sum < s){
            n++;
            sum += n;
        }

        if(sum > s){
            n--;
        }
        System.out.println(n);
    }
}

/*
 * 백준 1789 수들의 합
 * 실버 5
 * 
 * 알고리즘 분류
 * 수학
 * 그리디 알고리즘
 * 
 * 문제 요약
 * 서로 다른 n개의 수의 합을 s라고 한다.
 * s를 알고 있을 때 n의 최댓값을 구하기
 * 
 * 조건
 * 1 <= s <= 4,294,967,295
 * 
 * 풀이
 * int의 최댓값을 넘기 때문에 long을 사용한다.
 * 서로 다른 n개의 수이고 최대의 값을 가져야 하기 때문에 sum을 만들어 s 이상이 될 때까지 1부터 계속 더한다.
 * 반복문이 종료되면 sum이 s를 넘는지 검사한다. 넘으면 n - 1 하고 출력한다. 아니면 그대로 출력하면 끝난다.
 * sum이 s를 넘으면 - 1 해줘야 하는 이유
 * 예제 1번에서 200을 1부터 계속 더하면 19까지 더했을 때 190이 된다.
 * 그리고 20을 더하면 sum이 210이 된다. 이 때 반복문을 빠져나오게 된다. n은 20이다.
 * 10이 초과되기 때문에 1부터 이어진 수열에서 10을 제외한다. sum은 200이고 n은 19이다.
 * 그럼 10을 제외하고 1부터 20까지 더한 숫자가 n을 구성하는 수가 된다.
 * 따라서 sum이 s를 초과하면 - 1 작업을 해주어야 한다.
 */