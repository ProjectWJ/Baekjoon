import java.io.*;
import java.util.ArrayList;

public class Main1094 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int result = 64;
        int temp, temp2;
        int min = 64;
        int minI = 0;

        if(input == 64){
            System.out.println("1");
            return;
        }


        while(true){
            // 가지고 있는 막대의 길이를 모두 더하기
            result = 0;
            for(int i = 0; i < list.size(); i++){
                result += list.get(i);
            }
            // 합이 input과 같다면 출력 후 종료
            if(result == input){
                System.out.println(list.size());
                return;
            }

            // 가지고 있는 막대 중 가장 짧은 것 찾기
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < min){
                    min = list.get(i);
                    minI = i;
                }
            }

            // 가장 짧은 막대 절반으로 자르기  
            if(list.size() >= 1){
                list.remove(minI);
            }
            temp = min / 2;
            temp2 = temp;

            // temp2를 제외한 남은 막대 길이 구하기
            int namunStickSize = temp;
            for(int i = 0; i < list.size(); i++){
                namunStickSize += list.get(i);
            }

            // 남은 막대의 길이의 합(temp까지 합쳐서)이 input 이상이면 temp2를 제외
            if(namunStickSize >= input){
                list.add(temp);
            }
            else{
                list.add(temp);
                list.add(temp2);
            }
        }
    }
}


/*
 * 백준 1094번 막대기
 * 
 * 해당 길이의 막대를 구하기 위해 몇 개의 막대가 필요한지 알아내는 문제
 * 
 * 23cm의 막대를 가지려고 한다. 답은 4가 나와야 한다.
 * 
 * 1. 64cm 막대를 절반으로 자른다. 23보다 크니까 하나를 버린다.
 * 2. 32cm 막대를 절반으로 자른다. 16, 16이다.
 * 3. 16cm 막대를 절반으로 자른다. 16, 8, 8이다. 24보다 크니까 8 하나를 버린다.
 * 4. 8cm 막대를 절반으로 자른다. 16, 4, 4이다.
 * 5. 4cm 막대를 절반으로 자른다. 16, 4, 2, 2이다.
 * 6. 2cm 막대를 절반으로 자른다. 16, 4, 2, 1, 1이다. 24보다 크니까 1 하나를 버린다.
 * 7. 16, 4, 2, 1을 더하면 23이 된다.
 * 8. 4개니까 4를 출력하면 끝
 * 
 * 
 * 32cm 막대를 가지려고 한다.
 * 
 * 1. 64cm 막대를 절반으로 자른다. 32랑 똑같으니 하나를 버린다.
 * 2. 32cm 막대 완성
 * 
 * 48cm 막대를 가지려고 한다.
 * 
 * 1. 64cm 막대를 절반으로 자른다. 자른 막대의 합이 48보다 작으니 버리지 않는다. [32, 32]
 * 2. 32cm 막대를 절반으로 자른다. 자른 막대의 합이 48과 같으니 하나를 버린다. [32, 16]
 * 3. 둘이 합치면 48이니 완성
 */