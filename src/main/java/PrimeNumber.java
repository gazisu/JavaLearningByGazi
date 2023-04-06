import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int numb= numbers.nextInt();
        int count=0;

        for(int i = 2; i < numb; i++){
            if(numb%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not primem number");
        }
    }
}
