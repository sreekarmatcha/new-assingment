import java.util.*;
class test1 {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("ravi");
        al.add("vijay");
        al.add("Gouthu");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.hasNext());
        }
    }
}
