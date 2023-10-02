import java.io.*;
import java.util.*;

public class 기타줄{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 끊어진 기타줄의 수
        int m = Integer.parseInt(st.nextToken()); // 기타줄의 브랜드 수
        int result = 0;
        int minPackage = 1000;
        int minEach = 1000;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a < minPackage){
                minPackage = a;
            }
            if(b < minEach){
                minEach = b;
            }
        }

        // 낱개 6개가 패키지 가격 이하인 경우
        if(minEach * 6 <= minPackage){
            result = minEach * n;
        }
        // 패키지가 낱개 6개보다 싼 경우
        else{
            // 패키지만 샀을 때
            int packageCharge = (n % 6) == 0 ? n / 6 : n / 6 + 1;
            packageCharge *= minPackage;

            // 최대 패키지 + 낱개를 샀을 때
            int packageAndEach = n / 6;
            packageAndEach *= minPackage;
            int elseCharge = n % 6;
            elseCharge *= minEach;
            packageAndEach += elseCharge;

            if(packageCharge < packageAndEach){
                result = packageCharge;
            }
            else{
                result = packageAndEach;
            }
        }

        System.out.println(result);
    }
}

/*
 * 백준 1049 기타줄
 * 실버 4
 * 
 * 알고리즘 분류
 * 수학
 * 그리디 알고리즘
 * 
 * 문제 요약
 * 기타줄의 패키지 가격과 낱개 가격이 주어질 때 돈을 최소로 써서 기타줄 구매하기
 * 
 * 조건
 * 1 <= n <= 100
 * 1 <= m <= 50
 * 0 <= 가격 <= 1000
 * 
 * 풀이
 * 일반적인 통념상 패키지로 사는 것이 이득이다 라고 생각할 수 있으나
 * 패키지가 더 비싸고 낱개가 싼 경우도 분명히 있을 수 있다.
 * 따라서 패키지만 사는 경우, 낱개만 사는 경우, 낱개 + 패키지로 사는 경우를 생각할 수 있다.
 * 
 * 먼저 패키지의 가격과 낱개의 가격을 비교한다.
 * 낱개 * 6의 가격이 패키지보다 싸다면?
 * 패키지를 사용하는 어떠한 경우도 낱개로 사는 것보다 쌀 수는 없다.
 * 낱개만 사는 경우가 가장 저렴하며 낱개의 값 * 끊어진 기타줄의 수
 * 
 * 패키지로 사는 것이 더 효율적이라면?
 * 패키지만 vs 패키지 + 낱개
 * 이렇게 나뉠 수 있다.
 * 
 * 패키지만 사는 경우
 * 끊어진 기타줄이 6의 배수라면 (끊어진 기타줄의 수 / 6) * 패키지의 가격
 * 6의 배수가 아니라면 패키지를 하나 더 사야 하므로 위의 식에 + 1 해준다.
 * 
 * 패키지 + 낱개로 사는 경우
 * 이 경우는 패키지를 최대한 많이 사는 것이 효율적이다.
 * (끊어진 기타줄의 수 / 6) * 패키지의 가격 -> 패키지의 총 가격
 * (끊어진 기타줄의 수 % 6) * 낱개의 가격 -> 남은 낱개의 총 가격
 * 이 둘을 더해 패키지만 사는 경우와 비교해 더 값이 싼 쪽이 정답이다.
 * 
 * 
 */
