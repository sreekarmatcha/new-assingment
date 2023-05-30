public class additionprogram {
    public static void main(String[] args) {
        int num1=5;
        int num2=4;
        int sum=addNumbers(num1,num2);
        System.out.println("sum:"+sum);
    }
    public static int addNumbers(int a,int b){
        int sum=a+b;
        return sum;
    }
}
