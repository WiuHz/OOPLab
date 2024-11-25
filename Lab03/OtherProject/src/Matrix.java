import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int row = inp.nextInt();
        int col = inp.nextInt();
        int[][] m1 = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                m1[i][j] = inp.nextInt();
            }
        }
        int[][] m2 = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                m2[i][j] = inp.nextInt();
            }
        }
        int[][] sum = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.println(sum[i][j]);
            }
        }
    }
}