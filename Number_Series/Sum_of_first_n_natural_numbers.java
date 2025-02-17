package solve_problems.Number_Series;


import java.util.Scanner;

public class Sum_of_first_n_natural_numbers {
  public static void main(String[] args)  {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      for(int i=0;i<=n;i++){
          sum+=i;
      }
      System.out.print(sum);
  }
}
