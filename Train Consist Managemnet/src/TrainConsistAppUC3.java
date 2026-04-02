import java.util.HashSet;
import java.util.Set;

public class TrainConsistAppUC3 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique bogies
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}