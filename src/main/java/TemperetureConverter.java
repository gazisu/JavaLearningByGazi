import java.util.Scanner;

public class TemperetureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celsius, Fahrenheit;
        System.out.println("Celsius = ");
        Celsius=input.nextDouble();

        Fahrenheit= 1.8 * Celsius + 32;

        System.out.println("Fahrenheit: "+Fahrenheit);
    }
}
