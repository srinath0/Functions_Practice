import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call the method without parameters and without return type
//        Evenodd1();
//
//        // Call the method with parameters and without return type
//        Evenodd2(sc);
//
//        // Call the method without parameters and with return type
//        String result1 = Evenodd3();
//        System.out.println(result1);

        // Call the method with parameters and with return type
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String result2 = Evenodd4(num);
        System.out.println(result2);
    }

    // Without parameters and without return type
//    public static void Evenodd1() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int a = sc.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd Number");
//        }
//    }

    // With parameters and without return type
//    public static void Evenodd2(Scanner sc) {
//        System.out.println("Enter the number:");
//        int a = sc.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//    }

    // Without parameters and with return type
//    public static String Evenodd3() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int a = sc.nextInt();
//        if (a % 2 == 0) {
//            return "Even number";
//        } else {
//            return "Odd number";
//        }
//    }

    // With parameters and with return type
    public static String Evenodd4(int a) {
        if (a % 2 == 0) {
            return "Even number";
        } else {
            return "Odd number";
        }
    }
}