
package solve_problems.Leetcode.String_programming;

public class Number_of_Segements {
    public static void main(String[] s){
       String text="Hello, my dear sister";
       System.out.print(segements(text));
    }
    public static int segements(String seg){
        int c=0;
        if(seg.equals("")){
            return 0;
        }

        
        String[] a=seg.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i]!=""){
                c++;
            }
        }
            
        return c;
    }
}