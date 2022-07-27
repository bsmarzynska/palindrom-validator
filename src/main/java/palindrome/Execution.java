package palindrome;

public class Execution {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Validator validator = new Validator();

        String number = reader.readNumber();

        if(number == null)
            System.exit(1);
        for (int i = 0; i < 1000; i++) {
            if (validator.isPalindrome(number)) {
                System.out.println("Number " + number + " is a palindrome");
                System.out.println("Number of iterations: " + i);
                break;
            } else {
                number = validator.stringValueOfSum(number, validator.reverseString(number));
                if (i == 999) {
                    System.out.println("Number of iterations reached 1000, no palindrome found.");
                }
            }
        }
    }
}
