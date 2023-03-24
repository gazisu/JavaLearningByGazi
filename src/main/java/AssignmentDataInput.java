/*


import java.util.Scanner;
public class AssignmentDataInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int ID, Price;
        String Title, Description, Category;
        System.out.print("Enter ID: ");
        ID = input.nextInt();
        System.out.print("Enter Title: ");
        Title = input.next();
        System.out.print("Enter Price: ");
        Price = input.nextInt();
        System.out.print("Enter Description: ");
        Description = input.next();
        System.out.print("Enter Category: ");
        Category = input.next();


        System.out.println("ID: "+ID);
        System.out.println("Title: "+Title);
        System.out.println("Price: "+Price);
        System.out.println("Description: "+Description);
        System.out.println("Category: "+Category);


    }
}
*/
import java.util.Scanner;

public class AssignmentDataInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ID, Price;
        String Title, Description, Category;

        System.out.print("Enter ID: ");
        ID = input.nextInt();
        System.out.print("Enter Title: ");
        Title = input.nextLine(); // consume newline character left by input.nextInt()
        Title = input.nextLine();
        System.out.print("Enter Price: ");
        Price = input.nextInt();
        System.out.print("Enter Description: ");
        Description = input.nextLine(); // consume newline character left by input.nextInt()
        Description = input.nextLine();
        System.out.print("Enter Category: ");
        Category = input.nextLine();

        System.out.println("ID: " + ID);
        System.out.println("Title: " + Title);
        System.out.println("Price: " + Price);
        System.out.println("Product Description: "+Description);
        System.out.println("Product Category: "+Category);

    }
}