package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sectionSum_two {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[][]arr = new int[N+1][N+1];
        int[][]arr2 = new int[N+1][N+1];
        int result = 0;

        for(int i = 1 ; i <arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j< N+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1 ; i <arr.length; i++){
            for(int j = 1 ; j< N+1; j++){
                arr2[i][j] = arr2[i][j-1] + arr2[i-1][j] - arr2[i-1][j-1] + arr[i][j];
            }
        }


        for(int i = 1 ; i <S+1; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            result = arr2[x2][y2] - arr2[x1-1][y2] - arr2[x2][y1-1] + arr2[x1-1][y1-1];
            System.out.println(result);

        }




    }
}
