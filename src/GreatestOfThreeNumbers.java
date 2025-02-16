import java.util.Scanner;

public class GreatestOfThreeNumbers {
    static int a,b,c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        a = sc.nextInt();
        System.out.println("Enter the number:-");
        b = sc.nextInt();
        System.out.println("Enter the number:-");
        c = sc.nextInt();
        System.out.println(greatest());
    }
    //without paramter and with return type
    static int greatest(){
        if(a>b&&a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else {
            return c;
        }
   }
}
