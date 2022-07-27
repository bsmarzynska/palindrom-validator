import org.testng.Assert;
import org.testng.annotations.Test;
import palindrome.Validator;

public class ValidatorTests {
    Validator validator = new Validator();

    @Test
    public void whenPalindromeTypedThenIsPalindromeReturnTrue() {
        Assert.assertTrue(validator.isPalindrome("111"), "Number is a palindrome");
        System.out.println("TC passed: 111 is a palindrome");
    }

    @Test
    public void whenPalindromeIsNotTypedThenIsPalindromeReturnFalse() {
        Assert.assertFalse(validator.isPalindrome("112"), "Number is a palindrome");
        System.out.println("TC passed: 112 is not a palindrome");
    }

}
