import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        int i,rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        temp=i;
        while(i>0){
            rem=i%10;
            sum=sum+(rem*rem*rem);
            i=i/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}

