import java.io.*;

public class 이항계수_11050 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = br.readLine().split(" ");
        int n = Integer.parseInt(inputNum[0]);
        int k = Integer.parseInt(inputNum[1]);

        int result;

        int np = 1;
        int kp = 1;
        int n_kp = 1;

        for(int i = n; i > 0; i--){
            np *= i;
        }

        for(int i = k; i > 0; i--){
            kp *= i;
        }

        for(int i = n - k; i > 0; i--){
            n_kp *= i;
        }

        result = np / (kp * n_kp);
        System.out.println(result);
    }
}

/*
 * 백준 11050번 이항계수
 * 
 * https://ko.wikipedia.org/wiki/%EC%9D%B4%ED%95%AD_%EA%B3%84%EC%88%98
 * 이항계수는 다음과 같다.
 * 자연수 n 및 정수 k가 주어졌을 때
 * n!/(k!(n-k)!), 0<=k<=n일 때
 * 
 * 이 문제에서 조건은
 * 1 <= n <= 10, 0 <= k <= n이다.
 * 
 * 따라서 위의 공식을 사용하면 된다.
 */