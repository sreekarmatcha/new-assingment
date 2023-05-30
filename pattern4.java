public class pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int rows = 5;
            for (int j = 1; j <= rows; j++) {
                for (int k = i; k <= i; k++) {
                    System.out.print(k);
                }
                for (int l = i - 1; l >= i; l--) {
                    System.out.print(l);
                }
                System.out.println();
            }
        }
    }
}

