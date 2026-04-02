import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate, ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, ordered):");
        System.out.println(trainFormation);

        // Display total bogies
        System.out.println("\nTotal bogies: " + trainFormation.size());

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}


