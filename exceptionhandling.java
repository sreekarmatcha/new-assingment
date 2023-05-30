public class exceptionhandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = {1,2,3,4};

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("this is a arithmetic error " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is array error");
        }catch (Exception e){
            System.out.println("There is some error");
        }


        try {
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is array error " + e.getCause());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Some Error");
        }


        System.out.println("Program done 100%");
    }
}