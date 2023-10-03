import java.io.*;
import java.util.*;

public class 문자열_1120{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String bArray[] = b.split("");

        int changeCount = 0;
        int minChangeCount = b.length();

        for(int i = 0; i <= b.length() - a.length(); i++){
            String aArray[] = new String[b.length()];
            changeCount = 0;

            for(int j = i; j < a.length() + i; j++){
                aArray[j] = Character.toString(a.charAt(j - i));
            }

            for(int j = 0; j < b.length(); j++){
                if(aArray[j] == null){
                    continue;
                }
                else if(!aArray[j].equals(bArray[j])){
                    changeCount++;
                }
            }

            if(changeCount < minChangeCount){
                minChangeCount = changeCount;
            }
        }

        System.out.println(minChangeCount);
    }
}


/*
 * 백준 1120 문자열
 * 실버 4
 * 
 * 알고리즘 분류
 * 문자열
 * 브루트포스 알고리즘
 * 
 * 문제 요약
 * 길이가 n인 문자열 x, y가 있을 때 x와 y의 차이는 x[i] != y[i]인 i의 수이다.
 * x = "jimin", y = "minji"면 둘의 차이는 4이다.
 * 두 문자열 a, b가 주어질 때 a의 길이가 b와 같아질 때까지 앞이나 뒤에 아무 알파벳이나 추가한다.
 * a는 b 이하의 길이를 가지며, a와 b의 차이를 최소로 하고 그 차이를 출력하기
 * 
 * 조건
 * a, b의 길이는 최대 50
 * a의 길이는 b 이하이며, 알파벳 소문자로만 이루어짐
 * 
 * 풀이
 * a와 b의 길이가 같으면서 a와 b의 차이를 최소로 하면 결국 이런 말과 같다.
 * a의 앞, 뒤에 알파벳을 붙여 최대한 b와 동일하게 만들었을 때, a와 b의 i번째 글자가 다른 것이 모두 몇 개인가?
 * 여기서 보아야 할 것은, a와 b는 최대한 동일해야 한다는 점이다.
 * 따라서 a의 모자란 부분은 b와 동일할 것이기 때문에 a에 알파벳을 추가하는 것은 중요하지 않다.
 * 
 * 중요한 것은 "기존 a 문자열 덩어리가 어느 위치에 존재해야 차이가 최소가 되는 것인가?" 이다.
 * 예제 1번을 보겠다.
 * a가 0번째부터 시작하는 경우
 * a d a a b c
 * a a b a b b c
 * 1, 2, 5번째의 알파벳이 다르므로 차이는 3이다.
 * a가 1번째부터 시작하는 경우
 *   a d a a b c
 * a a b a b b c
 * 2, 4번째의 알파벳이 다르므로 차이는 2이다.
 * 
 * 따라서 올바른 접근법은 다음과 같다.
 * 1. 길이가 b.length()인 배열 array를 생성한다.
 * 2. 시작점에 맞추어 array에 a의 문자를 하나씩 삽입한다.
 * 3. 배열의 값이 존재할 때 이 n번째 값이 b의 n번째 값과 차이가 있는지 검사한다.
 * 4. 2, 3을 0부터 시작하여 b.length - a.length까지 진행한다.
 * 5. 최소 차이를 구하여 출력하면 끝
 */