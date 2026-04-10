import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

class ReduceTest {

    // Utility method for reduce operation
    private int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 70),
                new Bogie("AC", 80),
                new Bogie("FC", 50)
        );

        int total = calculateTotalSeats(list);

        assertEquals(200, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 60),
                new Bogie("AC", 75),
                new Bogie("FC", 65)
        );

        int total = calculateTotalSeats(list);

        assertEquals(200, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Collections.singletonList(
                new Bogie("Sleeper", 90)
        );

        int total = calculateTotalSeats(list);

        assertEquals(90, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int total = calculateTotalSeats(list);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 40),
                new Bogie("AC", 60)
        );

        int total = calculateTotalSeats(list);

        // 40 + 60 = 100 ensures map() extracted correctly
        assertEquals(100, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 50),
                new Bogie("AC", 50),
                new Bogie("FC", 50)
        );

        int total = calculateTotalSeats(list);

        assertEquals(150, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC", 80));

        int originalSize = list.size();

        int total = calculateTotalSeats(list);

        // Check original list unchanged
        assertEquals(originalSize, list.size());
        assertEquals(2, list.size());
    }
}