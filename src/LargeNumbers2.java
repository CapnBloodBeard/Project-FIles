
public class LargeNumbers2 {
    

    public static void main(String[] args) {
        // Create an array of Strings to hold large numbers
        String[] largeNumbers = new String[5];

        // Initialize the array with some large numbers as strings
        largeNumbers[0] = "123456789012345678901234567890";
        largeNumbers[1] = "987654321098765432109876543210";
        largeNumbers[2] = "1234567890123456789012345678901234567890";
        largeNumbers[3] = "9876543210987654321098765432109876543210";
        largeNumbers[4] = "12345678901234567890123456789012345678901234567890";

        // Print the large numbers
        for (int i = 0; i < largeNumbers.length; i++) {
            System.out.println("Large Number " + i + ": " + largeNumbers[i]);
        }

        // Example of adding two large numbers
        String number1 = largeNumbers[0];
        String number2 = largeNumbers[1];
        String sum = addLargeNumbers(number1, number2);
        System.out.println("Sum of first two large numbers: " + sum);
    }

    // Method to add two large numbers represented as strings
    public static String addLargeNumbers(String num1, String num2) {
        // Reverse the strings to make addition easier
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int maxLength = Math.max(sb1.length(), sb2.length());

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < sb1.length() ? sb1.charAt(i) - '0' : 0;
            int digit2 = i < sb2.length() ? sb2.charAt(i) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result to get the final sum
        return result.reverse().toString();
    }
}
