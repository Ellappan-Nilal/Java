
package solve_problems.Pattern.Number;

import java.util.Scanner;

/**
1
23
456
78910
1112131415
 * 
 */
public class Increasenumberbyrow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}


