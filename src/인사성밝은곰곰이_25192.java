import java.io.*;
import java.util.*;

public class 인사성밝은곰곰이_25192{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        int count = 0;

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                count += hs.size();
                hs.clear();
            }
            else if(!hs.contains(input)){
                hs.add(input);
            }
        }
        if(!hs.isEmpty()){
            count += hs.size();
        }
        System.out.println(count);
    }
}

/*
 * 백준 25192 인사성 밝은 곰곰이
 * 실버 4
 * 
 * 알고리즘 분류
 * 자료 구조
 * 해시를 사용한 집합과 맵
 * 트리를 사용한 집합과 맵
 * 
 * 문제 요약
 * 채팅 기록 중 곰곰티콘이 사용된 수를 출력하기
 * 
 * 조건
 * 1 <= n <= 100,000
 * 1 <= 닉네임 길이 <= 20
 * 
 * 풀이
 * ENTER 이후 처음 채팅 친 것이 곰곰티콘 인사를 입력한 것이다.
 * 만약 같은 닉네임이 두 번 이상 나온다면, 인사 이후 일반 채팅을 입력한 것이다. 인사가 아니므로 노카운트
 * ENTER가 또 나온다면 두 번째의 새로운 사람이 들어온 것이다.
 * 따라서 알고리즘을 다음과 같이 구성할 수 있다.
 * 1. ENTER가 나온다면 새 사람이 들어온 것이므로 그때동안 저장한 닉네임의 수를 count+=하고 Set을 초기화한다.
 * 2. ENTER가 아니고, ENTER 이후 첫 채팅을 한 사람이라면 곰곰티콘 인사이므모 Set에 추가한다.
 * 3. 1 ~ 2를 n번 반복한다.
 * 4. 반복이 무사히 끝나면 마지막으로 Set을 검사하여 인사한 사람들을 count+=한다.
 * 5. 이러면 모든 사람의 곰곰티콘 사용 수를 체크한 것이므로 count 출력하고 종료한다.
 */