import java.io.*;
import java.util.StringTokenizer;

public class 색종이_2563{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int paperCase = Integer.parseInt(br.readLine());
        int drawing[][] = new int[101][101];
        int result = 0;

        for(int i = 0; i < paperCase; i++){
            String paperInput = br.readLine();
            st = new StringTokenizer(paperInput);
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            for(int j = left; j < left + 10; j++){
                for(int k = right; k < right + 10; k++){
                    drawing[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(drawing[i][j] == 1){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}

/*
 * 백준 2563 색종이
 * 실버 5
 * 
 * 알고리즘 분류
 * 구현
 * 
 * 문제 요약
 * 가로, 세로의 길이가 각각 10인 색종이가 붙은 검은 영역의 넓이 출력하기
 * 
 * 조건
 * 색종이의 수는 100개 이하
 * 도화지의 크기는 100
 * 색종이가 도화지 밖으로 나가지는 않음
 * 
 * 풀이
 * 크기가 101 * 101인 2차원 배열을 사용하면 된다.
 * 입력받은 왼쪽, 아랫쪽 값에 각각 + 10까지 반복하는 2중 for문을 만든다.
 * 하면 도화지에 넓이 100의 색종이가 그려진다.
 * 이후 도화지를 순회하며 색칠된 부분을 세면 끝난다.
 */