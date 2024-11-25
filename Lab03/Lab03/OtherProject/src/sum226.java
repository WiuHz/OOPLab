//tonghieutichthuong
import java.util.Scanner;

public double Sum(double a, double b){
    return a+b;
}

public double Abstract(double a, double b){
    return a-b;
}

public double Product(double a, double b){
    return a*b;
}

public double Quotient(double a, double b){
    return a/b;
}

public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double sum = Sum(a, b);
        double dif = Abstract(a, b);
        double pro = Product(a, b);
        double quo = Quotient(a, b);
        System.out.println(sum);
        System.out.println(dif);
        System.out.println(pro);
        System.out.println(quo);
    }
}