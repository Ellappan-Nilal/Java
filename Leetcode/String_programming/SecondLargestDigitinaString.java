package String_programming;

public class SecondLargestDigitinaString {

    public static void main(String[] args) {
        SecondLargestDigitinaString obj = new SecondLargestDigitinaString();

        String input = "abc12345def6789";
        int result = obj.secondHighest(input);

        System.out.println("Second largest digit: " + result); 
    }

    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit < largest && digit > secondLargest) {
                    secondLargest = digit;
                }
            }
        }

        return secondLargest;
    }
}
