import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2_2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Queue<Integer> card = new LinkedList<>();

        for(int i = 1; i <= Integer.parseInt(input); i++){
            card.add(i);
        }

        while(card.size() != 1){
            // 제일 위의 카드 버리기
            card.poll();

            // 제일 위의 카드를 버림과 동시에 맨 뒤에 삽입
            card.offer(card.poll());
        }
        
        System.out.println(card.poll());
    }
}

/*
 * 백준 2164번 카드2
 * 
 * n장의 카드가 있다. 1~n까지 번호가 붙어있고, 1번이 제일 위에, n번이 가장 밑에 있다.
 * 다음과 같은 동작을 카드가 1장 남을 때까지 반복한다.
 * 1. 제일 위에 있는 카드를 바닥에 버린다.
 * 2. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
 * 예를 들어, 1234 카드가 있으면 1을 제거하고 2를 밑으로 옮겨 342가 되게 하는 방식이다.
 * 
 * ArrayList를 사용하면 시간초과 뜬다
 * 
 * 큐를 사용하면 된다.
 * 큐 사용법
 * https://cocoon1787.tistory.com/774
 * 문제 풀이
 * https://st-lab.tistory.com/188
 * 
 * offer은 큐 맨 뒤에 삽입
 * poll은 큐 맨 앞에 있는 값을 반환 후 삭제한다. print에다 사용하면 출력된 후 삭제
 */