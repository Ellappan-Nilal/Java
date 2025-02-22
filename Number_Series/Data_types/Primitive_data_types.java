import java.util.Scanner;
import java.math.BigInteger;
public class Primitive_data_types {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            
            try{
                String x=sc.next();
                BigInteger num=new BigInteger(x);
                if(num.compareTo(BigInteger.valueOf(Short.MIN_VALUE))>=0 && num.compareTo(BigInteger.valueOf(Short.MAX_VALUE))<=0){
                   System.out.println(x + " can be fitted in:");
                    System.out.print("*.short");
                }
                if(num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>=0 && num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<=0){
                    System.out.print("* int");
                }
                if(num.compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0 && num.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0){
                    System.out.println(x + " can be fitted in:");
                    System.out.print("* long");
                }
            }catch(Exception e){
                System.out.print(sc.next() +" can't be fitted anywhere.");
            }
        }
    }
}
