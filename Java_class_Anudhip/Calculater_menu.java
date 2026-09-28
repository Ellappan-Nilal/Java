package solve_problems.Java_class_Anudhip;
import java.util.Scanner;
public class Calculater_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculater Menu");
        System.out.println("1. Addtion");
        System.out.println("2. Subraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();

        System.out.println("Enter the process to choose 1 to 4");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int add = a + b;
                System.out.println("Addition " + add);
                break;
            case 2:
                int sub = a - b;
                System.out.println("Subraction " + sub);
                break;
            case 3:
                int mul=a*b;
                System.out.println("Multiplication "+mul);
                break;
            case 4:
                int div=a/b;
                System.out.println("Division "+div);
                break;
            default:
                System.out.println("Enter correct function");
        }

    }
}
