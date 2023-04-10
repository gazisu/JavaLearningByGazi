package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;

        double[] number = new double[5];
        System.out.print("Please enter 5 number: ");
        for(int i=0; i< 5; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 1; i < 5; i++){
            sum=sum+number[i];

        }
//        number[1] = input.nextDouble();
//        number[2] = input.nextDouble();
//        number[3] = input.nextDouble();
//        number[4] = input.nextDouble();
//

        System.out.println("Total: "+sum);
    }
}
