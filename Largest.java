import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        Q: Find the largest of the 3 numbers
        int max = a;
        if (b>a){
            max = b;
        }
        if (c>b){
            max = c;
        }
        System.out.println(max);
    }
}
