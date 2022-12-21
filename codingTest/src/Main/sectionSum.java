package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sectionSum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //데이터의 개수, 질의 갯수
        int S = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];  //구간 합을 구할 대상 배열

        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i < N; i ++){
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < S; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(start == 1){
                System.out.println(arr[end-1]);

            }
            else{
                System.out.println(arr[end-1] - arr[start-1-1]);

            }
        }



    }
}
