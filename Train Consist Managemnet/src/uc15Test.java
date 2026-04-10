import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CargoManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie bogie = new GoodsBogie("Cylindrical");

        assertDoesNotThrow(() -> {
            bogie.assignCargo("Petroleum");
        });

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        // Exception is handled internally, so no crash
        bogie.assignCargo("Petroleum");

        // Cargo should not be assigned
        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");  // unsafe
        bogie.assignCargo("Coal");       // safe after failure

        assertEquals("Coal", bogie.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        // We can't directly assert finally block execution,
        // but we ensure method completes without interruption
        assertDoesNotThrow(() -> {
            bogie.assignCargo("Petroleum");
        });
    }
}