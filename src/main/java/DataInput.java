/*
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter number: ");
        number = input.nextInt();

        System.out.println("The number is :"+number);
    }
}
*/

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Name = "Anisul Islam";

        System.out.println("Enter Name:");
        Name = input.nextLine();
        System.out.println("Welcome Mr.:"+Name);
    }
}