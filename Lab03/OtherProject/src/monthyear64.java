import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        if(x < 0 || x > 12 || y < 0){
            System.out.println(" ");
        }
        else{
            if(y%4 != 0 || y%100 == 0 && y%400 != 0){
                if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12){
                    System.out.println("31");
                }
                else if(x == 4 || x == 6 || x == 9 || x == 11){
                    System.out.println("30");
                }
                else{
                    System.out.println("28");
                }
            }
            else{
                if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12){
                    System.out.println("31");
                }
                else if(x == 4 || x == 6 || x == 9 || x == 11){
                    System.out.println("30");
                }
                else{
                    System.out.println("29");
                }
            }
        }
    }
}