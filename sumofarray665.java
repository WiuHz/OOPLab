import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] number = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = inp.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += number[i];
        }
        System.out.println(sum);
    }
}