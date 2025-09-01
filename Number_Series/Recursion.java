package solve_problems.Number_Series;
public class Recursion {
    public static void main(String[] args){
           // int i=10;
           //f1(i);
           int result =fact(5);
           System.out.println(result);
           
    }
    public static void f1(int i){
        System.out.println(i);
        if(i>0){
            f1(i-1);
        }
    }
    public static int fact(int i){
        if(i!=0){
            return i*fact(i-1);
        }
        return 1;
    }
}





