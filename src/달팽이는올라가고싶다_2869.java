import java.util.Scanner;

public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int v = scan.nextInt();
        int result;

        if((v - b) % (a - b) == 0){
            result = ((v - b) / (a - b));
        }
        else{
            result = ((v - b) / (a - b)) + 1;
        }

        System.out.println(result);
        scan.close();
    }
}

/* 백준 2869번 달팽이는 올라가고 싶다.*
 * 
 * 정상에 도달했을 때 b의 경우의 수(길이)를 뺀다.(v - b)
 * 설명)
 * 달팽이가 정상까지 올라가기 전까지 가능한 최소의 높이(v - a)
 * 달팽이가 하룻동안 올라가고 미끄러지는 높이(a - b)
 * 따라서 달팽이가 마지막 날 올라가는 높이를 빼고 계산해야 한다.
 * 나머지가 0이라면 (v - a)에 딱 맞춰서 정상에 도착한 것이고
 * 나머지가 0이 아니라면 길이가 약간 애매하게 남아 하루 더 올라가야 한다.(+ 1)
 * 
 * 왜 v - a를 꼭 해줘야 하는가?
 * a - b가 달팽이가 미끄러지는 길이도 포함되어 있기 때문이다.
 * 정상에 도착할 때 미끄러지지 않는다는 조건이 있으므로, 마지막 날이 될 수 있는 최소한의 높이로 계산하는 것이다.
 * 
 * 따라서 (v - b) / (a - b)가 정답이 되고, 나머지가 0이 아니라면 여기에 +1해주면 된다.
 */