import java.util.*;

public class uc19 {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Step 1: Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Step 2: Ensure array is sorted
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Input (can be unsorted)
        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        System.out.println("Searching for: " + searchKey);

        boolean found = binarySearch(bogies, searchKey);

        if (found) {
            System.out.println("Bogie found!");
        } else {
            System.out.println("Bogie not found.");
        }
    }
}