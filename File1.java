import java.util.*;

public class File1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element at index " + i + " is " + list.get(i));
        }
        System.out.println("Now, let's try to remove elements from the list while iterating over it.");
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            System.out.println("Removed element at index " + i);
        }
        System.out.println("After removal:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element at index " + i + " is " + list.get(i));
        }
        System.out.println("End of program.");
    }
}