
/*
 * Assignment 3 user input
 * Create a class called product
 * Create a main method
 * declare validables: Id, Title, Price, Description, Category
 * get user input for each varriables,
 * Print the variables
 */

import java.util.Scanner;
public class AssignmentDataInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int ID, Price;

        System.out.print("Enter ID: ");
        ID = input.nextInt();
        System.out.print("Enter Title: ");
        String Title = input.next();
        System.out.print("Enter Price: ");
        Price = input.nextInt();
        System.out.print("Enter Description: ");
        String Description = input.next();
        System.out.print("Enter Category: ");
        String Category = input.next();


        System.out.println("ID: "+ID);
        System.out.println("Title: "+Title);
        System.out.println("Price: "+Price);
        System.out.println("Description: "+Description);
        System.out.println("Category: "+Category);


    }
}
