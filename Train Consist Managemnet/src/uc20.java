import java.util.*;

public class uc20 {

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // Step 1: Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Step 2: Perform search (Linear Search)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {}; // Empty array (test case)

        try {
            boolean result = searchBogie(bogies, "BG101");
            System.out.println("Search Result: " + result);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}
