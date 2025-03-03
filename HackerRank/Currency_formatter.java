import java.util.*;
import java.text.*;
public class Currency_formatter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double pay=sc.nextDouble();
        NumberFormat USF=NumberFormat.getCurrencyInstance(Locale.US);
        String us=USF.format(pay);
        NumberFormat INDIAF=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=INDIAF.format(pay);
         NumberFormat CHF=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=CHF.format(pay);
         NumberFormat FF=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=FF.format(pay);
        
        System.out.println("US"+us);
        System.out.println("India"+india);
        System.out.println("China"+china);
        System.out.println("France"+france);
    }
}
