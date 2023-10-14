import java.io.*;
import java.util.*;

public class 베스트셀러_1302{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hs = new HashMap<>();
        ArrayList<String> list;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String input = br.readLine();

            if(hs.containsKey(input)){
                hs.put(input, hs.get(input) + 1);
            }
            else{
                hs.put(input, 1);
            }
        }

        int max = 0;
        for(String value : hs.keySet()){
            max = Math.max(max, hs.get(value));
        }

        list = new ArrayList<>(hs.keySet());
        Collections.sort(list);
        
        for(String key : list){
            if(hs.get(key) == max){
                System.out.println(key);
                break;
            }
        }
    }
}

/*
 * 백준 1302 베스트셀러
 * 실버 4
 * 
 * 알고리즘 분류
 * 자료 구조
 * 문자열
 * 정렬
 * 해시를 사용한 집합과 맵
 * 
 * 문제 요약
 * 가장 많이 팔린 책의 제목 출력하기
 * 
 * 조건
 * 1 <= n <= 1,000
 * 
 * 풀이
 * 
 * 
 * 풀이 참고
 * https://zoonvivor.tistory.com/138
 */