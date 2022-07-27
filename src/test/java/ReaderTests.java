import org.testng.Assert;
import org.testng.annotations.Test;
import palindrome.Reader;

public class ReaderTests {

    Reader reader = new Reader();

    @Test
    public void isInputValid_whenValidInput_shouldReturnTrue() {
        Assert.assertTrue(reader.isInputValid("195"), "Validation failed");
        System.out.println("TC passed: 195 is valid format");
    }

    @Test
    public void isInputValid_whenInvalidInput_shouldReturnFalse() {
        Assert.assertFalse(reader.isInputValid("invalid input"), "Validation failed.");
        System.out.println("TC passed: invalid input is invalid format");
    }

    @Test
    public void isInputValid_whenEmptyInput_shouldReturnFalse() {
        Assert.assertFalse(reader.isInputValid(""), "Validation failed.");
        System.out.println("TC passed: empty string is invalid format");
    }

    @Test
    public void isInputValid_whenNullInput_shouldReturnFalse() {
        Assert.assertFalse(reader.isInputValid(null), "Validation failed.");
        System.out.println("TC passed: null value is invalid format");
    }

}
