import java.io.*;

public class 누울자리를찾아라{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int n = Integer.parseInt(br.readLine());
        String input[] = new String[n];
        int width = 0;
        int height = 0;

        for(int i = 0; i < n; i++){
            input[i] = br.readLine();
        }

        for(int i = 0; i < n; i++){
            String hori[] = input[i].split("X");
            width += count(hori);

            sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append(input[j].charAt(i));
            }

            String vert[] = sb.toString().split("X");
            height += count(vert);
        }

        System.out.println(width + " " + height);
    }

    static int count(String array[]){
        int countValue = 0;
        
        for(int j = 0; j < array.length; j++){
            if(array[j].contains("..")) {
                countValue++;
            }
        }

        return countValue;
    }
}

/*
 * 백준 1652 누울 자리를 찾아라
 * 실버 5
 * 
 * 알고리즘 분류
 * 구현
 * 문자열
 * 
 * 문제 요약
 * "."이 2개 이상 붙은 것 가로세로로 몇 개인지 찾아보기
 * 
 * 조건
 * 방의 크기는 정사각형
 * 1 <= n <= 100
 * 점이 3개 이상 붙은 것도 1개의 누울 자리로 처리(ex ..X나 ....X나 모두 1자리)
 * 
 * 풀이
 * 문자열을 입력받은 뒤 ".."이 contain이 되어있는가 확인하면 된다.
 * 단, 이 경우를 주의해야 한다.
 * if(input[i].contains("..")){
 *     width++;
 * }
 * 코드를 이렇게 구성할 경우 ..X..와 같이 한 줄에 누울 자리가 2개인 경우를 체크하지 못한다.
 * 따라서 1줄을 X로 split하여 배열화시켜 검사한다.
 * 
 * 대략적인 알고리즘
 * 1. 입력받은 가로(혹은 세로) 1줄을 X를 기준으로 split하여 배열로 만든다.
 * 2. 배열의 length 길이까지 진행하는 반복문을 열어 배열을 검사한다.
 * 3. 배열의 값에 ".."이 contain이 되어 있으면 누울 자리가 있는 것이므로 해당 값을 ++한다.
 * 4. 가로, 세로 모두 검사했으면 출력하면 끝
 */