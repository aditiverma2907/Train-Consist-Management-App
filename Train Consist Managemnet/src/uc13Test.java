import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceComparisonTest {

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80)
        );

        List<Bogie> result = PerformanceComparisonApp.filterWithLoop(list);

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 40),
                new Bogie("B", 65),
                new Bogie("C", 90)
        );

        List<Bogie> result = PerformanceComparisonApp.filterWithStream(list);

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80)
        );

        List<Bogie> loopResult = PerformanceComparisonApp.filterWithLoop(list);
        List<Bogie> streamResult = PerformanceComparisonApp.filterWithStream(list);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie("A", i));
        }

        long start = System.nanoTime();
        PerformanceComparisonApp.filterWithLoop(list);
        long end = System.nanoTime();

        long time = end - start;

        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie("A", (int)(Math.random() * 100)));
        }

        List<Bogie> result = PerformanceComparisonApp.filterWithStream(list);

        // Just verify it runs and returns valid result
        assertNotNull(result);
    }
}