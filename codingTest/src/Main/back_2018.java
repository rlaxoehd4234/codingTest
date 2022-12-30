package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;
        int result = 1;
        int count = 1;// N이 되는 수는 무조건 하나라고 미리 카운트하고 시작한다.


        while(end != N){
            if(result == N){   // result 와 N 이 같은 경우에 count ++ 해주고 엔드값을 올려준다.
                count++;
                end++;
                result += end;
            }
            else if(result > N){
                result -= start;      // result 가 N 보다 큰 경우에는 start 포인트에서 부터 앞으로 떙겨 오면서 값을 비교해줍니당.
                start++;
            }
            else{       // N 보다 작은 경우에는 end point 를 올려주고 더해줍니다.
                end++;
                result += end;
            }
        }
        System.out.println(count);
    }
}
