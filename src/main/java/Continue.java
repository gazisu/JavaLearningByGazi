public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i=i+2){
            if (i==13) {
                continue;
            }
            System.out.println(i);
        }

    }
}
