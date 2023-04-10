package Array;

public class Arrayclass {
    public static void main(String[] args) {
        int[] number = new int[5];

        number[0] = 12;
        number[1] = 12;
        number[2] = 12;
        number[3] = 12;
        number[4] = 12;
        int sum =number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Total: "+sum);

        int len= number.length;
        System.out.println("length: "+len);

    }

    }


