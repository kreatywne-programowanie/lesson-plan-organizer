import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import Nauczyciel;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Nauczyciel> list = new ArrayList<Nauczyciel>();// Creating arraylist
        list.add(new Nauczyciel("Adam", "Adamski", "Brzeska"));
        list.add(new Nauczyciel("Adam2", "Adamski2", "Brzeska2"));
        list.add(new Nauczyciel("Adam3", "Adamski3", "Brzeska3"));
        list.add(new Nauczyciel("Adam4", "Adamski4", "Brzeska4"));
        
        System.out.println("Traversing list through List Iterator:");
        // Here, element iterates in reverse order
        ListIterator<Nauczyciel> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            Nauczyciel str = list1.previous();
            System.out.println(str.przedstawSie());
        }
        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).przedstawSie());
        }

        System.out.println("Traversing list through forEach() method:");
        // The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a -> { // Here, we are using lambda expression
            System.out.println(a.przedstawSie());
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<Nauczyciel> itr = list.iterator();
        itr.forEachRemaining(a -> // Here, we are using lambda expression
        {
            System.out.println(a.przedstawSie());
        });
    }
}