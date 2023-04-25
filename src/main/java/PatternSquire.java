public class PatternSquire {
    public static void main(String[] args) {

        for (int raw=1; raw<=6; raw++ ){
            for (int col=6; col<raw; col--){
                System.out.print(" x ");
            }
            System.out.println(" t ");

        }
    }
}
