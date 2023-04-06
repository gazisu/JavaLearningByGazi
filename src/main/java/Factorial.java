import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, factorial = 1;
        System.out.println("Enter Factorial Number: ");
        number=sc.nextInt();

        for (int i=number; i >=1; i--){
            factorial = factorial*i;


        }
        System.out.println("Factorial of "+number+" = "+factorial);
    }
}
