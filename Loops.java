import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of if Statement :
            if (boolean expression T or F) {
            // body
            } else{
                // do this
                }
         */
//            int salary = 25400;
//            if (salary < 10000) {
//                salary = salary + 2000;
//            } else if (salary > 20000) {
//                salary = salary+3000;
//
//            } else {
//                salary = salary + 1000;
//            }
//        System.out.println(salary);
//        Q : print numbers from 1 to 5
//        for (int num = 1; num <= 5; num+=2){
//            System.out.println(num);
//        }
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.println("Heloo world ");
//        }
//            int num = 1;
//            while (num <=5){
//                System.out.println(num);
//                num++;
//            }
        int num = 1;
        do {
            System.out.println("hello world");
            num++;
        }while (num!=5);
    }
}
