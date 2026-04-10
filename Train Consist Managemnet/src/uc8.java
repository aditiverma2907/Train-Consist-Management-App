import java.util.*;
import java.util.stream.*;

class uc8 {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}

public class uc8 {
    public static void main(String[] args) {

        // Step 1: Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 60));
        bogies.add(new Bogie("AC Chair", 75));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies found.");
        } else {
            filteredBogies.forEach(System.out::println);
        }

        // Step 4: Verify original list is unchanged
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);
    }
}
