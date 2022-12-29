package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back_10986 {
    //나머지 합 구하기

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        long[] S = new long[N];
        long[] C = new long[T];
        long result = 0;


        st = new StringTokenizer(br.readLine());
        S[0] = Long.parseLong(st.nextToken());
        for(int i = 1; i < N; i++){
            S[i] = S[i-1]+ Long.parseLong(st.nextToken());
        }



        for(int i = 0; i< N; i++){
            int remainder = (int)(S[i] % T);

            if(remainder == 0) result++; // 배열의 시작부터 i 까지 이미 나누어 떠어진다는 말이다.

            C[remainder]++;
        }


        for(int i =0; i<T; i++){
            if(C[i] > 1){
                result = result + (C[i] * (C[i]-1) / 2);
            }
        }
        System.out.println(result);
    }
}
