import java.util.Scanner;

public class FunctionsFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int fine = factorial(a);
        System.out.println(fine);
    }
    //with parameter and return type
    public static int factorial(int num){
        int result =1;
            if(num==0){
                return 1;
            }
            else{
                for(int i=1;i<=num;i++){
                    result *= i;
            }
                return result;
        }


    }
}
