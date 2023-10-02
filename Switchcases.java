import java.util.Scanner;
public class Switchcases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits ");
//            case "orange" -> System.out.println("Round fruit ");
//            case "grapes" -> System.out.println("small fruits");
//            default -> System.out.println("please enter valid fruit");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");

        }
    }
}
