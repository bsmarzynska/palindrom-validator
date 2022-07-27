package palindrome;

import java.math.BigInteger;

public class Validator {

    public String reverseString(String plainString) {
        String reversedString = "";
        for (int i = plainString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + plainString.charAt(i);
        }
        return reversedString;
    }

    public String stringValueOfSum(String number, String reversedNumber) {
        BigInteger sum = new BigInteger(number);
        BigInteger reversedNumberValue = new BigInteger(reversedNumber);
        sum = sum.add(reversedNumberValue);
        return String.valueOf(sum);
    }

    public boolean isPalindrome(String input) {
        String reversedInput = reverseString(input);
        if (input.equals(reversedInput)) {
            return true;
        } else {
            return false;
        }
    }
}
