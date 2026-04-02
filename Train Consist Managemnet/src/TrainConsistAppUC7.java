import java.util.*;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display format
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistAppUC7 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by capacity ascending):");
        System.out.println(bogies);

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}