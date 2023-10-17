import java.io.*;

public class Hashing{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long sum = 0;
        long pow = 1;
        int m = 1234567891;

        for(int i = 0; i < num; i++){
            // 문자 설정
            int asc = input.charAt(i) - 96;
            // sum에 asc * (31의 pow제곱)이 저장된다.
            // 오버플로우 방지를 위해 % m을 꼭 붙여줄 것
            sum += (asc * pow) % m; 
            pow = (pow * 31) % m; // 얘도
        }
        
        System.out.println(sum % m);
    }
}

/*
 * 백준 15829 Hashing
 * 브론즈 2
 * 
 * 문제에서 주어진 해시함수와 입력으로 주어진 문자열을을 써서 계산한 해시 값 출력하기
 * 
 * 힌트
 * abcde는 1 × 31^0 + 2 × 31^1 + 3 × 31^2 + 4 × 31^3 + 5 × 31^4 = 1 + 62 + 2883 + 119164 + 4617605 = 4739715이다.
 * zzz는 26 × 31^0 + 26 × 31^1 + 26 × 31^2 = 26 + 806 + 24986 = 25818이다.
 * 식으로 표현하면 (i번째 문자의 int값 * 31^i) + ....
 * 
 * 풀이
 * 기본적으로는 위 힌트에 적힌 식으로 풀이하면 된다.
 * 하지만 이 경우에는 자바에서 Large 케이스에서 오버플로우가 발생한다.
 * 31 * n^50 이라는 어마무시하게 큰 숫자를 담아낼 공간이 없기 때문이다.
 * 때문에 long형으로 두고 31의 제곱을 할 때마다 1234567891로 나눠 나머지를 구해 저장해야 한다.
 * 모듈러 연산이라고 a = (b * c) % d라고 했을 때, a = (b % d) * (c % d)가 가능하기 때문이라고 한다.
 * 
 * 
 * 개선점
 * 자바의 오버플로우 범위를 예상하지 못해 50점에서 계속 해메었다.
 * 파이썬은 값 범위가 이론상 무한이라 자바에서 50점짜리 답안을 내어도 파이썬은 100점을 받는다고 한다.
 * 
 * 풀이 참고
 * https://velog.io/@bassy3260/%EB%B0%B1%EC%A4%80-15829%EB%B2%88-Hashing-JAVA
 */