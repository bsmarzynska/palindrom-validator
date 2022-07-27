package palindrome;

import java.math.BigInteger;

public class PalindromeActions {

    public boolean isPalindrome(String input) {
        String reversedInput = reverseString(input);
        return input.equals(reversedInput);
    }

    public String stringValueOfSum(String number) {
        BigInteger sum = new BigInteger(number);
        BigInteger reversedNumberValue = new BigInteger(reverseString(number));
        sum = sum.add(reversedNumberValue);
        return String.valueOf(sum);
    }

    private String reverseString(String plainString) {
        String reversedString = "";
        for (int i = plainString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + plainString.charAt(i);
        }
        return reversedString;
    }
}
