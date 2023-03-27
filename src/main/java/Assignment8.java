import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ans;
        char ans2;

        System.out.println("Have you complete your master's Degree? Answer Y/N: ");
        ans = input.next().charAt(0);
        System.out.println("Are you fluent in english? Answer Y/N: ");
        ans2 = input.next().charAt(0);

        if(ans=='Y' && ans2=='Y'){
            System.out.println("You are eligible for the interview! :)");
        } else {
            System.out.println("Sorry(:. You are not eligible for the interview)");

    }
}
}