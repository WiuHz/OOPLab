// stars
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 0; i <= n; i++){
            String b = "";
            String s = "";
            for(int j = 1; j < n - 1; j++){
                b += " ";
            }
            for(int j = 1; j < 2*i + 1; j++){
                s += "*";
            }
        }
        System.out.println(s + b);
    }
}
