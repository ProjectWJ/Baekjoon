import java.io.*;
import java.util.*;

public class 투자의귀재배주형_19947{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int take[] = new int[11];
        take[0] = h;

        for(int i = 1; i <= y; i++){
            take[i] = (int) (take[i - 1] * 1.05);

            if(i >= 3){
                take[i] = (int) Math.max((take[i - 3] * 1.2), take[i]);
            }
            if(i >= 5){
                take[i] = (int) Math.max((take[i - 5] * 1.35), take[i]);
            }
        }

        System.out.println(take[y]);
    }
}

/*
 * 백준 19947 투자의 귀재 배주형
 * 실버 5
 * 
 * 알고리즘 분류
 * 다이나믹 프로그래밍
 * 브루트포스 알고리즘
 * 
 * 문제 요약
 * 초기 비용 h를 가지고 y년 후 가장 많은 금액을 얻을 투자 패턴을 분석 후 출력하기
 * 
 * 조건
 * 10,000 <= h <= 100,000
 * 0 <= y <= 10
 * 
 * 풀이
 * 5%, 20%, 35%의 배율을 가진 연도가 무조건 유리하다.
 * 1부터 y년까지 1년, 3년, 5년의 배율을 고려해 계산한 값을 모두 비교하여 가장 큰 값을 take[i]에 넣는다.
 * y까지 반복하면 끝
 */