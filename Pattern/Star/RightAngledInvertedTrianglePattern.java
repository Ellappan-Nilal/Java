package Pattern.Star;

import java.util.Scanner;

public class RightAngledInvertedTrianglePattern {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>0;i--){
        for(int j=1;j<i;j++){
            System.out.println(i);
        }
        System.out.println();
    }
}
