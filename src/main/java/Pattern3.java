public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for (int raw= 0 ;  raw<= n ; raw++){
            for (int col=1 ;  col<= raw ; col++){
                System.out.print(" b ");

            }
            System.out.println(" a ");
        }
        System.out.println(" ");
//        int m=6;
        for (int raw=6 ; raw>=1 ; raw--){
            for(int col=1; col< raw; col++){
                System.out.print(" w ");
            }
            System.out.println(" x ");

        }
    }
}
