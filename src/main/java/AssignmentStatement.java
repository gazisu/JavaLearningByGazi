import java.util.Scanner;

public class AssignmentStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.println("Enter Age: ");
        age = input.nextInt();
        if (age>=18){
//        if (age == 18){
            System.out.println("Valid Voter:");
        }
//        else if (age>18) {
//            System.out.println("Valid Voter");
//        }
        else {
            System.out.println("Invalid Voter");
        }
    }
}
