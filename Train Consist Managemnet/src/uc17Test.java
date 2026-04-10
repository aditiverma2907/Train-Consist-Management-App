import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieNameSortAppTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        BogieNameSortApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        BogieNameSortApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        BogieNameSortApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        BogieNameSortApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        BogieNameSortApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"Sleeper"},
                arr
        );
    }
}