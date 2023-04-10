import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter line number: ");
        int n= input.nextInt();

        for(int row=1; row<= n; row++){     //small to large
            for (int col=1; col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        System.out.println();
        for(int row=1; row<= n; row++){      //small to large
            for (int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println();
        for(int row=n; row>= 1; row--){     //large to small
            for (int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
