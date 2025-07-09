
package solve_problems.Pattern.Character;

import java.util.Scanner;

/*  A 
   C E 
  G I K 
 M O Q S 
U W Y [ ] 
 */
public class Odd_character {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c+=2;
            }
            System.out.println();
        }
    }
}
