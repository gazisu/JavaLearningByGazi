import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter a Number: ");
        number1=input.nextInt();
        System.out.println("Enter a Number: ");
        number2=input.nextInt();


        for (int i=number1; i<=number2; i++){

            for (int j=1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("\n\n");
        }


    }
}
