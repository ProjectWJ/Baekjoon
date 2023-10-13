import java.io.*;

public class 설탕배달_2839{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nArray[] = new int[5001];
        boolean second = false; // 2번 조건 검사문

        for(int i = 3; i < 5001; i++){
            // 2번 조건 부합 여부 초기화
            second = false;

            // 1번 조건
            if(i % 5 == 0){
                nArray[i] = i / 5;
                continue;
            }
            // 2번 조건
            for(int a = i - (i % 5); a >= 5;){
                if((i - a) % 3 == 0){
                    nArray[i] = (a / 5) + (i - a) / 3;
                    second = true;
                    break;
                }
                // if문을 통과 시 결과가 false이므로 a를 5 감소시킴
                a = a - 5;
            }
            // 2번 조건에 부합하면 3번 조건 계산하지 않고 넘기기
            if(second == true){
                continue;
            }

            // 3번 조건
            if(i % 3 == 0){
                nArray[i] = i / 3;
            }
            else{
                nArray[i] = -1;
            }
        }

        int n = Integer.parseInt(br.readLine());

        System.out.println(nArray[n]);
    }
}

/*
 * 백준 2839 설탕 배달
 * 실버 4
 * 
 * 문제
 * 3, 5킬로그램 봉지가 있다.
 * 배달해야 할 설탕 N킬로그램이 주어진다.
 * 최대한 설탕 봉지를 적게 사용하기
 * 
 * 조건
 * N은 3 ~ 5000의 범위
 * 정확히 N킬로그램을 만들 수 없다면 -1 출력
 * 
 * 풀이
 * N의 범위가 크지 않으므로 효율을 위해 5000 크기의 배열을 만들어 채운다.
 * 봉지의 수를 최소화하는 것이 목적이므로 5kg 봉지를 최대한 많이 활용해야 한다.
 * 따라서 계산은 5로 먼저 한 다음 3으로 계산해야 한다.
 * 봉지 계산 우선순위는 다음과 같다.
 * 1번 조건 : 5로 나누어 떨어지는가?
 * 2번 조건 : n보다 작은 5의 배수로 나눈 나머지를 3으로 나눴을 때 나누어 떨어지는가?
 * 3번 조건 : 3으로 나누어 떨어지는가?
 * 
 * 2번 조건 상세 설명
 * 수 n을 검사하는 상황일 때, 2번 조건 진행 알고리즘은 다음과 같다.
 * 1. 변수 a에 n 이하의 가장 큰 5의 배수를 넣는다. for(int a = n - (n % 5); a >= 5;){...}
 * 2. n - a를 한 다음, 이 숫자가 3으로 나누어떨어지는지 확인한다. if((n - a) % 3 == 0){...}
 * 3. 나누어떨어진다면, a / 5로 5킬로 봉지의 수와 (n - a) / 3로 3킬로 봉지의 수를 더해 nArray[n]에 입력한다.
 * 4. 나누어떨어지지 않는다면, a를 5 감소시킨 다음 2번으로 돌아간다.
 * 5. a가 5 미만이 된다면, 조건에 부합하지 않으니 다음 조건으로 넘어간다.
 * 
 * 후기 및 개선
 * 아무런 레퍼런스 없이 풀었고 정답을 받았지만 2번 조건을 작성하는 데 상당히 애먹었다.
 * 또 수의 규칙을 찾지 못했다.
 * https://st-lab.tistory.com/72
 * 여기서 수의 규칙을 찾아 문제를 해결한 사례가 있다.
 */
