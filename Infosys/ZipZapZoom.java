package Infosys;

import java.util.Scanner;

class ZipZapZoom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Zoom");
        } 
        else if (n % 3 == 0) {
            System.out.println("Zip");
        } 
        else if (n % 5 == 0) {
            System.out.println("Zap");
        } 
        else {
            System.out.println("Invalid");
        }
    }
}
