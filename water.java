public class water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int m=0,n;
        for(int i=0;i<9;i++){
            n=m+height[i];
            m=n;
        }
        System.out.println(m);

    }
}
