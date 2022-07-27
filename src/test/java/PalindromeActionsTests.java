import org.testng.Assert;
import org.testng.annotations.Test;
import palindrome.PalindromeActions;

public class PalindromeActionsTests {
    PalindromeActions palindromeActions = new PalindromeActions();

    @Test
    public void isPalindrome_whenPalindromeTypedThenReturnTrue() {
        Assert.assertTrue(palindromeActions.isPalindrome("111"), "Number 111 is a palindrome.");
        System.out.println("TC passed: 111 is a palindrome");
    }

    @Test
    public void isPalindrome_whenPalindromeIsNotTypedThenReturnFalse() {
        Assert.assertFalse(palindromeActions.isPalindrome("112"), "Number 112 is not a palindrome.");
        System.out.println("TC passed: 112 is not a palindrome");
    }

    @Test
    public void stringValueOfSum_whenNumberTyped_shouldReturnSum() {
        Assert.assertEquals(palindromeActions.stringValueOfSum("35"), "88", "Sum of 35 and 53 equals to 88");
        System.out.println("TC passed:Sum of 35 and 53 equals to 88");
    }

}
