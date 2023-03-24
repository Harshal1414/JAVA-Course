import java.util.*;
public class Linked_List_part2 {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("LinkedList"); // list.add("LinkedList"); 
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        list.remove(2);  // remove the element at specified Index.
        System.out.println(list);
    }
}
