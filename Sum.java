import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int Num1 = input.nextInt();
//        int Num2 = input.nextInt();
//        int sum = Num1 + Num2 ;
//        System.out.println("sum" + sum);
//        Type casting
//        int num = (int)(67.55f);
//        System.out.println(num);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        System.out.println(result);
    }
}
