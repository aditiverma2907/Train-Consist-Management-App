import java.util.*;
        import java.util.stream.*;

class uc9 {
    String type;
    int capacity;

    public uc9(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}

public class uc9 {
    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from previous UC)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 60));
        bogies.add(new Bogie("AC Chair", 75));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Convert to stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);
    }
