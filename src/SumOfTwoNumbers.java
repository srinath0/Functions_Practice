import java.util.Scanner;

public class SumOfTwoNumbers {
   // static int a,b; // Without arguments and with return type && //without type also
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a = sc.nextInt();
        System.out.println("Enter the number:-");
        int b = sc.nextInt();
//      System.out.println(result);
        sum(a,b);
    }
    //With arguments and with return type
//    public static int sum(int a,int b){
//        return a+b;
//       // System.out.println(c);
//
//    }
    //Without arguments and with return type
//    public static int sum(){
//        return a+b;
//    }
    //Without arguments and without return type
//    public static void sum(){
//        System.out.println((a+b));
//    }
    //With arguments and without return type
    public static void sum(int a,int b){
        System.out.println((a+b));
    }
}
