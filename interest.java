import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        try {
                System.out.println(totalinterest(p, t, r));
        }
        catch(ArithmeticException e){
                System.out.println("it is arithmetic error" + e);
        }
    }
        public static double totalinterest ( int a, int b, int c){
            double d = (a * b * c) /100;
            return d;
        }
}

// OOPS
//* Class & Object
// =================================================================
//1. Inheritance
class a{
    String name = "Dharani";
}

class b extends a{
    public void printer(){
        System.out.println(name);
    }
}

class Inherit{
    public static void main(String[] args) {
        b user1 = new b();
        user1.printer();
    }
}

// =====================================================================
//2. Encapsulation

class aa{
    private String userName;
    private String actualName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }
}

class bb{
    public static void main(String[] args) {
        aa user1 = new aa();
        user1.setUserName("Dharani");
        user1.setActualName("Dharani Gowtham");

        System.out.println(user1.getActualName());
        System.out.println(user1.getUserName());
    }
}

// ============================================================================
//3. Polymorphism

// a. Static Polymorphism - Method Overloading

class xxx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = getC(10,20,45);
        System.out.println(c);
    }

    private static int getC(int a, int b) {
        return a + b;
    }

    private static int getC(int a, int b, int c) {
        return a + b + c;
    }
}

// Constructor Overloading

class xx{
    int age;
    String name;
    public xx(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class yy{
    public static void main(String[] args) {
        xx user1 = new xx(12,"Dhaari");
    }
}


// Dynamic Polymorphism

class asd{
    public void run(){
        System.out.println("Not running");
    }
}

class dsa extends  asd{
    @Override
    public void run(){
        System.out.println("Running");
    }
}

class ads{
    public static void main(String[] args) {
        dsa d1 = new dsa();
        d1.run();

        asd d2 = new asd();
        d2.run();
    }
}

// ====================================================================
//4. Abstraction
abstract class xyz{
    abstract void tellYourName();

    abstract void tellYourAge();
}

class xz extends xyz{
    @Override
    void tellYourName() {

    }

    @Override
    void tellYourAge() {

    }
}

//=====================================================================
//4. Interface


interface hello{
    default void test() {
        System.out.println("This is hello");
    }
}

interface world{
    default void test2() {
        System.out.println("This is world");
    }
}

class qwe extends asd implements hello,world{
    @Override
    public void test2(){
        System.out.println("This is a qwe class => from test2 method");
    }
}

class qwer{
    public static void main(String[] args) {
        qwe w1 = new qwe();
        w1.test2();
        w1.test();
    }
}