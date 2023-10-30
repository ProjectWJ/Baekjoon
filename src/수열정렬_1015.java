import java.io.*;
import java.util.*;

public class 수열정렬_1015{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        int b[] = new int[n];
        int min = 1000;
        int max = 0;
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = a[i];
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }

        int rank = 0;

        while(min <= max){
            for(int i = 0; i < n; i++){
                if(a[i] == min){
                    b[i] = rank;
                    rank++;
                }
            }
            min++;
        }

        for(int i = 0; i < n; i++){
            sb.append(b[i]).append(" ");
        }
        System.out.println(sb);
    }
}

/*
 * 백준 1015 수열 정렬
 * 실버 4
 * 
 * 알고리즘 분류
 * 정렬
 * 
 * 문제 요약
 * 주어진 수열이 그 안에서 몇 등인지 표기하는 문제이다.
 * 
 * 조건
 * 1 <= 배열의 크기 <= 50
 * 1 <= 배열의 원소 크기 <= 1,000
 * 같은 수가 여러 개라면 왼쪽이 더 높은 순위를 가짐.
 * 
 * 풀이
 * 최솟값과 최댓값을 구해서 최솟값부터 시작해 1씩 더하며 배열에 해당 원소가 있는지 알아내면 된다.
 * 1. 원본 배열, 등수를 표기할 배열을 만든다.
 * 2. 원본 배열에 값을 입력받는다. 최대, 최소도 같이 알아낸다.
 * 3. 최솟값부터 시작해서 최댓값보다 커질 때까지의 반복문을 만든다.
 * 4. 반복문 안에서 원본 배열을 처음부터 끝까지 순회하여 최솟값이 존재하는지 확인한다.
 * 5. 있으면 등수를 표기할 배열에 등수를 입력하고, 등수를 1 더해 다음 등수를 준비한다.
 * 6. 원본 배열의 순회가 끝났으면 해당 최솟값까지 모두 검사가 완료된 것이므로 최솟값을 1 더한다.
 * 7. 4 ~ 6의 과정을 최솟값이 최댓값보다 커질 때까지 반복한다.
 * 8. 모든 반복이 끝났으면 등수를 표기할 배열이 완성된 것이므로 sb에 저장해서 출력하면 된다.
 */