import java.util.Scanner;

public class Serial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter last Number");
        n=input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i+" x "+i+" ");
            sum = sum + i* i;


        }
        System.out.println();
        System.out.println("Total "+sum);
    }
}
