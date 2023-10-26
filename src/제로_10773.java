import java.io.*;
import java.util.Stack;

public class 제로_10773{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> st = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                st.pop();
            }
            else{
                st.push(n);
            }
        }

        int result = 0;
        int stSize = st.size();

        for(int i = 0; i < stSize; i++){
            result += st.peek();
            st.pop();
        }
        
        System.out.println(result);
    }
}

/*
 * 백준 10773 제로
 * 실버 4
 * 
 * k개의 줄에 정수가 1개씩 주어진다.
 * 정수가 0이면 가장 최근에 쓴 수를 지우고 아닐 경우 해당 수를 쓴다.
 * 정수가 0이 나올 때 반드시 스택이 비어있지 않음을 보장한다.
 * 
 * 조건
 * k의 범위는 1 ~ 100,000을 가진다.
 * 입력되는 정수 n은 0 ~ 1,000,000의 범위를 가진다.
 * 
 * 풀이
 * 구현 자체는 스택을 사용할 줄 안다면 매우 간단히 만들 수 있다.
 * 다만 마지막에 수를 더하는 과정에서 st.size()를 반복문 조건에 쓰면 다음과 같은 반례가 발생한다.
 * 입력은 다음과 같다.
 * 2
 * 1
 * 1
 * for문 순회 도중 st.pop();으로 인해 st.size()가 바뀌어 i와 st.size()가 둘 다 1이 된다.
 * 따라서 두 번째 반복을 진행하지 않고 1을 출력하니 주의하기
 */