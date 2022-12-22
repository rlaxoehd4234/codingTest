package Main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] arrN = new int[N][N];
        int[][] arrSUM = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arrN[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == 0 && j == 0)
                    arrSUM[i][j] = arrN[i][j];
                else if(i == 0){
                    arrSUM[i][j] = arrN[i][j] - arrN[i][j-1];
                }else if(j == 0){
                    arrSUM[i][j] = arrN[i][j] - arrN[i-1][j];
                }else{
                    arrSUM[i][j] = arrSUM[i-1][j] + arrSUM[i][j-1] - arrSUM[i-1][j-1] + arrN[i][j];
                }
            }
        }



    }
}
