import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> SET = new HashSet<>();

        // Add elements to the SET
        SET.add("Element1");
        SET.add("Element2");
        SET.add("Element3");

        // Attempt to add a duplicate element
        SET.add("Element1");

        // Print the SET. Note that the duplicate "Element1" is not added
        System.out.println(SET); // Output: [Element1, Element2, Element3]
        System.out.println(SET.size()); // Output: 3
    }
}