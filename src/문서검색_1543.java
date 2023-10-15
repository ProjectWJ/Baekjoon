import java.io.*;

public class 문서검색_1543{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String check = br.readLine();
        int check_length = check.length();
        int count = 0;

        for(int i = 0; i <= input.length() - check_length;){
            String temp = input.substring(i, i + check_length);

            if(temp.equals(check)){
                count++;
                i += check_length;
            }
            else{
                i++;
            }
        }

        System.out.println(count);
    }
}

/*
 * 백준 1543 문서 검색
 * 실버 5
 * 
 * 알고리즘 분류
 * 문자열
 * 브루트포스 알고리즘
 * 
 * 문제 요약
 * 주어진 문자열에서 특정한 단어가 몇 개나 나오는지 세어보기
 * 단, 이미 센 문자열에서 찾지는 말 것
 * ex) abababa에서 ababa를 찾을 때, 0번부터 찾는 경우와 2번부터 찾는 경우의 동시 세기 불가능
 * 
 * 조건
 * 문자열의 길이는 최대 2500
 * 찾고 싶은 단어의 길이는 최대 50
 * 알파벳 소문자와 공백으로만 이루어짐
 * 
 * 풀이
 * 먼저 문자열 전체 input과 찾고자 하는 단어 check를 입력받는다.
 * 반복문 i를 열어 임시 변수 temp에 i부터 i + check.length()까지 substring하여 저장한다.
 * 예를 들어 input == ababababa이고, check == ba일 때
 * 첫 번째 반복에서 temp는 ab, 두 번째 반복에서 ba를 저장하게 된다.
 * 이 temp를 check와 비교하여 같다면 count++한다.
 * 또한, 동시 세기를 불가하게 해야 하므로 다음 탐색은 check.length()만큼 건너뛰어야 한다.
 * 비교해서 다르다면 i++한다.
 * 이 과정을 i <= input.length() - check.length() 까지 반복한다. i가 저걸 넘어서면 예외 오류가 발생한다.
 * 반복 종료 후 마지막으로 count를 출력하면 끝난다.
 */