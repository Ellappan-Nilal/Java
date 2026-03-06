
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Findday {
    static String findDay(int Day, int Month, int Year) {
        LocalDate date = LocalDate.of(Year, Month, Day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        // Function call
        String result = findDay(day, month, year);

        // Output
        System.out.println("Day of the week: " + result);

        sc.close();
    }
}

