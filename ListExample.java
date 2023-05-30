import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Removing an element by index
        numbers.remove(2); // Removes the element at index 2 (30)

        // Removing an element by value
        numbers.remove(Integer.valueOf(20)); // Removes the element with value 20

        // Iterating over the modified list
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
