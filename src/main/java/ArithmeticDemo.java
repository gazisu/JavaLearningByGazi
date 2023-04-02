import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2, result;

        System.out.println("Enter Number1: ");
        number1 = input.nextInt();
        System.out.println("Enter Number2: ");
        number2 = input.nextInt();


        result = number1 + number2;
        System.out.println("Sum Value="+result);

        result = number1 - number2;
        System.out.println("Subtraction Value="+result);

        result = number1 * number2;
        System.out.println("Multiplication Value="+result);

        result = number2 / number1;
        System.out.println("Divided Value="+result);
        result = number2 % number1;
        System.out.println("Remainder Value="+result);
        //test
    }

}
