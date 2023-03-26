import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter Number: ");
        number = input.nextInt();

        if (number > 0){
        System.out.println("Positive :)");
        }
        else if (number<0) {
            System.out.println("Negative (:");

        } else {
            System.out.println("Egual");
        }
    }
}
