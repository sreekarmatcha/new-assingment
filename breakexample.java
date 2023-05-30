public class breakexample {
    public static void main(String[] args) {
        System.out.println("example of using break with nested loops:");
        for(int i=1;i<=3;i++){
            System.out.println("outer loop:"+i);
            for(int j=1;j<=3;j++){
                if(j==2){
                    break;
                }
                System.out.println("inner loop:"+j);
            }
        }

    }
}
