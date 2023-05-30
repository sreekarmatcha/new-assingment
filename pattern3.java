import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
           for(int k=num-i;k>=i;k--)
               System.out.print(" ");
           for (int j=1;j<=2*i-1;j++)
                System.out.print("*");
           System.out.println();

        }
    }
}
