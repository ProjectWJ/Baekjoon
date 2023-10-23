import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기_1920 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String n = br.readLine();
        StringTokenizer inputN = new StringTokenizer(br.readLine(), " ");
        String m = br.readLine();
        String mNum[] = br.readLine().split(" ");

        int nNum[] = new int[Integer.parseInt(n)];

        for(int i = 0; i < Integer.parseInt(n); i++){
            nNum[i] = Integer.parseInt(inputN.nextToken());
        }

        Arrays.sort(nNum);

        for(int i = 0; i < Integer.parseInt(m); i++){
            int targetNum = Integer.parseInt(mNum[i]);
            if(binarySearch(nNum, targetNum) == true){
                result.append("1");
            }
            else{
                result.append("0");
            }
            result.append("\n");
        }
        System.out.print(result);
    }

    public static boolean binarySearch(int nNum[], int targetNum){
        int start = 0;
        int end = nNum.length - 1;
        int mid;

        while(start <= end){
            mid = (start + end) / 2;

            if(nNum[mid] == targetNum){
                return true;
            }
            else if(nNum[mid] < targetNum){
                start = mid + 1;
            }
            else if(nNum[mid] > targetNum){
                end = mid - 1;
            }
        }
        return false;
    }
}
/*
 * 백준 1920번 수 찾기
 * 
 * n개의 정수 a1, a2, ... an이 주어졌을 때, 이 안에 x라는 정수가 있는지 알아내기
 * 
 * 첫째 줄에 n, 둘째 줄에 n개의 정수
 * 셋째 줄에 m, 넷째 줄에 m개의 수가 주어진다.
 * 
 * 먼저 n배열을 순차 정렬한다. 그 다음 m배열로 이분탐색을 진행하면 된다.
 * 
 * 이분 탐색 기법
 * 1. 이분탐색은 대개 3가지 변수를 사용한다.
 * start = 0, end = 배열의 길이 - 1, mid = (start + end) / 2
 * 2. 그리고, 3가지 아이디어를 기록하면 된다.
 * 찾고자 하는 값이 배열[mid]보다 큰 경우, start 증가 start = mid + 1
 * 찾고자 하는 값이 배열[mid]보다 작은 경우, end 감소 end = mid - 1
 * 찾고자 하는 값이 배열[mid]에 위치한 경우, mid를 반환 return mid
 * 
 */