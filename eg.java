import java.util.Scanner;
public class eg {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        boolean isdone=false;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < 7; i++) {
            if (target == a[i]) {
                System.out.println(i);
                isdone=true;
            }
        }
        if(!isdone){
            System.out.println("-1");
        }
    }

}
