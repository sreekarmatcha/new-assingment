public class simpleinterest {
    public static void main(String[] args) {
        int p=10_000;
        int t=2;
        int r=2;
        int si=simpleinterest(p,t,r);
        System.out.println("simple interest:"+si);
    }
    public static int simpleinterest(int a,int b,int c){
        int si=(a*b*c)/100;
        return si;
    }
}
