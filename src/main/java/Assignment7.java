import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char Answer;
        System.out.print("Do you love Java? Enter Y/y/N/n: ");
        Answer = input.next().charAt(0);

        if (Answer == 'y' || Answer == 'Y') {
            System.out.println("You are a Java lover");
        } else if (Answer == 'N' || Answer == 'n') {
            System.out.println("You are not a Java lover");}

        else {
            System.out.println("No Result");
        }
    }
}