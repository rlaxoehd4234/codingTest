package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class back_1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int start = 0;
        int end = N-1;
        int count = 0;

        int[] arr= new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while(start < end){  //start 가 end 를 역전할 때 까지 while 문을 반복한다.
            if(arr[start] + arr[end] < S ){ // 둘의 합이 S 보다 작으면 start++
                start++;
            }
            else if(arr[start] + arr[end] > S){ // 둘의 합이 S보다 크면 end --
                end--;
            }
            else{                  // 그 둘이 아닌 경우는 S 와 같은 경우이므로 count++  그리고 ++ 했으므로 start ++ end --
                count ++;
                start++;
                end--;
            }


        }

        System.out.println(count);
        br.close();


    }
}
