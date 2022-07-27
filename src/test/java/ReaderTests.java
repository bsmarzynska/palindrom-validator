import org.testng.Assert;
import org.testng.annotations.Test;
import palindrome.Reader;

public class ReaderTests {

    Reader reader = new Reader();

    @Test
    public void isInputValid_whenValidInputThenReturnTrue() {
        Assert.assertTrue(reader.isInputValid("195"), "Input number is valid");
        System.out.println("TC passed: 195 is valid format");
    }

    @Test
    public void isInputValid_whenInvalidInputThenReturnFalse() {
        Assert.assertFalse(reader.isInputValid("invalid input"), "Input number is valid");
        System.out.println("TC passed: invalid input is invalid format");
    }

    @Test
    public void isInputValid_whenEmptyInputThenReturnFalse() {
        Assert.assertFalse(reader.isInputValid(""), "Input number is valid");
        System.out.println("TC passed: empty string is invalid format");
    }

    @Test
    public void isInputValid_whenNullInputThenReturnFalse() {
        Assert.assertFalse(reader.isInputValid(null), "Input number is valid");
        System.out.println("TC passed: null value is invalid format");
    }

}
