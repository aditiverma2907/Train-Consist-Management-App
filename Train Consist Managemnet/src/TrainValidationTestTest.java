import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistValidationTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(TrainConsistValidation.validateTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainConsistValidation.validateTrainID("TRAIN12"));
        assertFalse(TrainConsistValidation.validateTrainID("TRN12A"));
        assertFalse(TrainConsistValidation.validateTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(TrainConsistValidation.validateCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainConsistValidation.validateCargoCode("PET-ab"));
        assertFalse(TrainConsistValidation.validateCargoCode("PET123"));
        assertFalse(TrainConsistValidation.validateCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainConsistValidation.validateTrainID("TRN-123"));
        assertFalse(TrainConsistValidation.validateTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainConsistValidation.validateCargoCode("PET-Ab"));
        assertFalse(TrainConsistValidation.validateCargoCode("PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(TrainConsistValidation.validateTrainID(""));
        assertFalse(TrainConsistValidation.validateCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(TrainConsistValidation.validateTrainID("TRN-1234X"));
        assertFalse(TrainConsistValidation.validateCargoCode("PET-ABC"));
    }
}