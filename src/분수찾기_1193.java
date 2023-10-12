import java.io.*;

public class 분수찾기_1193{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int left = 1;           // 분자
        int right = 1;          // 분모
        boolean turn = true;    // 지그재그 턴
        int count = 0;          // 방향 지시용 카운트

        for(int i = 1; i < input; i++){
            if(i <= 2){
                if(i == 1){
                    right++;
                    continue;
                }
                else if(i == 2){
                    left++;
                    right--;
                    continue;
                }
            }
            else if(left == 1 & turn == true){
                right++;
                count++;
                turn = false;
            }
            else if(right == 1 & turn == true){
                left++;
                count++;
                turn = false;
            }
            else if(count % 2 == 1){ // 올라가야 할 때
                left--;
                right++;
                turn = true;
            }
            else if(count % 2 == 0){ // 내려가야 할 때
                left++;
                right--;
                turn = true;
            }
        }
        System.out.println(String.format("%d/%d", left, right));
    }
}

/*
 * 백준 1193 분수 찾기
 * 실버 5
 * 
 * 문제
 * 분수 배열을 지그재그로 읽는다 할 때, x번째 분수를 찾기
 * 
 * 조건
 * x는 1 ~ 10,000,000의 범위를 가진다.
 * 제한 시간은 0.5초
 * 
 * 풀이
 * 어느 한 쪽이든 1에 부딪히면 턴한다.
 * 왼쪽이 1이면 오른숫자를 +1한다.
 * 오른쪽이 1이면 왼숫자를 +1한다.
 * 홀수 번째 지그재그 나열일 때는 오른숫자가 올라가고 왼숫자가 내려간다.
 * 짝수 번째 지그재그 나열일 때는 왼숫자가 올라가고 오른숫자가 내려간다.
 * 적당히 if문을 작성해서 잘 작동되게 하면 끝
 * 
 */