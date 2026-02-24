public class Luckyno {
    public static void main(String[] args) {
        
        int number = 1623;   // You can change this number
        int sum = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;

            if (position % 2 == 0) {   // Even position
                sum += digit * digit;
            }

            number = number / 10;
            position++;
        }

        if (sum % 9 == 0) {
            System.out.println("Lucky Number");
        } else {
            System.out.println("Not a Lucky Number");
        }
    }
}

