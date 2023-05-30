import java.util.Iterator;
import java.util.PriorityQueue;

public class queues {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Hardik Pandya");
        queue.add("Jasprit Bumrah");
        queue.add("Mahendra Singh Dhoni");
        queue.add("Virat Kohli");
        System.out.println("head"+queue.element());
        System.out.println("head"+queue.peek());
        System.out.println("iterating the queue elements");
        Iterator itr= queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
