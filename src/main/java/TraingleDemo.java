import java.util.Scanner;

public class TraingleDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base: ");
        double Base = input.nextDouble();

        System.out.println("Enter Height: ");
        double Height = input.nextDouble();

        double area = 0.5 * Base * Height;

        System.out.println("Area of Traingle: "+ area);


    }
}
