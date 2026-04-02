import java.util.ArrayList;
import java.util.List;

public class TrainConsistAppUC1 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (empty list of bogies)
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train consist initialized successfully.");

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}
