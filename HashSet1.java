import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(4);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(12);
        System.out.println(myHashSet);
    }
}
