public class example {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("outer:" + i);
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue;
                }
                    System.out.println("inner:" + j);
            }
        }
    }
}

