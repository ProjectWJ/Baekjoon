import java.io.*;

public class k세준수{
    public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			int now = i;
			int max = 0;
			//현재 나눌 값인 i의 루트 값(Math.sqrt)이하 정수로 연산
			for(int j = 2; j <= Math.sqrt(i);) {
				//나누어떨어진면 같으 값으면 나누어떨어지지 않을때까지 연산
				if(now % j == 0) {
					now /= j;
					max = j;
				//나누어떨어지지 않으면 j +1
				}else {
					j++;
				}
			}
			//해당 반복문이 끝나면 최종 값이 1이 아니면 현재 값을 최댓값에 저장
			if(now != 1) max = now;
			//최댓값이 K보다 작거나 같으면 조건에 맞는 값이다.
			if(max <= K) count++;
		}
		System.out.println(count);
    }
}

/*
 * 백준 1418 K-세준수
 * 실버 5
 * 
 * 알고리즘 분류
 * 수학
 * 브루트포스 알고리즘
 * 정수론
 * 소수 판정
 * 에라토스테네스의 체
 * 
 * 문제 요약
 * 어떤 자연수의 소인수중 최댓값이 k보다 크지 않을 때 k-세준수라 부른다.
 * n보다 작거나 같은 자연수 중 k-세준수가 몇 개인지 알아내기
 * 
 * 조건
 * 1 <= n <= 100,000
 * 1 <= k <= 100
 * 
 * 풀이
 * 소인수는 어떤 수의 인수 중 소수인 것들을 말한다.
 * ex) 10의 인수는 1, 2, 5, 10인데 그 중 소수는 2, 5이다. 이게 소인수
 * 
 * 1. n까지의 소수 목록을 구한다.
 * 2. i까지의 인수를 구한다.
 * 3. i까지의 인수를 소수 목록과 대조해 k 이하의 소수인지 판별한다.
 * 4. 맞으면 count++한다. k를 넘어서면 다음으로 넘긴다.
 * 5. 이 과정을 2부터 n까지 반복
 */