import java.util.Scanner;

class displaythenextdate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        int maxDays = 31;
        // February
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                maxDays = 29;
            else
                maxDays = 28;
        }
        // Months with 30 days
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDays = 30;
        }
        // Next date logic
        if (d < maxDays) {
            d++;
        } else {
            d = 1;
            if (m < 12) {
                m++;
            } else {
                m = 1;
                y++;
            }
        }
        System.out.println(d + "-" + m + "-" + y);
    }
}