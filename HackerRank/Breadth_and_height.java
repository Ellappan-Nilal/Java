import java.util.*;
public class Breadth_and_height {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        
        if(B<=0||H<=0){
            System.out.print("Breadth and height must be positive");
        }else{
            int area;
            area=B*H;
            System.out.println(area);
        }
    }
}




