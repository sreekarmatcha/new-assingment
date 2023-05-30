//Write a program to reach the given target i.e.,sum=26 otherwise  print notfound
public class targetpgm {
    public static void main(String[] args) {
        boolean isdone = false;
        int[] arr={2,11,7,15};
        for( int i=0;i<3;i++) {
            for (int j = i + 1; j <=3; j++) {
                if ((arr[i] + arr[j]) == 26) {
                    System.out.println(+arr[i] + "," + arr[j]);
                    isdone = true;
                }
            }
        }
        if(!isdone){
            System.out.println("Not found");
        }
    }
}
