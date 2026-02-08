package Interview_questions.Infosys;
 import java.util.*;
public class Loanapply {   
class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int accNo=sc.nextInt();
		int sal=sc.nextInt();
		int accBal=sc.nextInt();
        String ltype=sc.nextLine();
        int exLA=sc.nextInt();
        int emis=sc.nextInt();
        
        if(sal>25000){
            System.out.println("eligibleLoanAmoun=500000");
            System.out.println("eligibleEmis=36");
        }else if(sal>50000){
            System.out.println("eligibleLoanAmoun=500000");
            System.out.println("eligibleEmis=60");
        }else {
           System.out.println("eligibleLoanAmoun=750000");
            System.out.println("eligibleEmis=84"); 
        }
		
	}
}


}
