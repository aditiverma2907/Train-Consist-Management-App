import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppUC6 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with capacity (key-value pairs)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display mapping using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nCapacity of Sleeper: " +
                bogieCapacity.get("Sleeper"));

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}