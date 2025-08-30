
package solve_problems.Number_Series;
import java.util.Scanner;
/**
 Input Format: The first line denotes the value of S.

Output Format: The first line contains the count of upper case letters in S.

Boundary Conditions: Length of S is from 3 to 100.

Example Input/Output 1: 
* 
* Input: ViCtorY

Output: 3

Example Input/Output 2: 
* Input: zookeeper

Output: 0
 * 
 */
public class uppercase_lette_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String in=sc.nextLine();
        int upper=0;
        for(int i=0;i<in.length();i++){
            char ch=in.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
        }
        System.out.print("Total uppercase count : "+upper);
        
    }
}
