package solve_problems.Number_Series;
import java.util.Scanner;
public class timeformat12to24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        int hours,mintues;
        String period="AM";
        hours=time/100;
        mintues=time%100;
        if(hours==0){
            hours=12;
        }else if(hours==12){
            period=period.replace('A', 'P');
        }else if(hours>12){
            hours-=12;
            period=period.replace('A', 'P');
        }
        System.out.printf("%02d:%02d %s",hours,mintues,period);
    }
}
