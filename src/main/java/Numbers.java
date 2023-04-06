import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum = 0, m, n;

        System.out.println("Enter Start Number:");
        m=input.nextInt();

        System.out.println("Enter End Number: ");
        n=input.nextInt();
        for (int i = m; i<=n; i++){
           if (i%2==0)  //even number
            sum= sum+i;
            System.out.print(i);

        }

        System.out.println("Total even: "+sum);
    }
}
