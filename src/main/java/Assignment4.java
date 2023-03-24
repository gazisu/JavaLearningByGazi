import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
                int PhonePrice= 18000;
                String Currency= "Euro";

                System.out.print("Installment: ");
                int number_of_Installment= Integer.parseInt(input.nextLine());

        System.out.println("Installment Amount: "+(PhonePrice / number_of_Installment) +Currency );

    }
}
