public class SumofGoodNumber {      
     
    
    public static void main(String[] args){
        SumofGoodNumber sgn=new SumofGoodNumber();
        System.out.print(sgn.SumofGoodNumber(20));
    }
    public int SumofGoodNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isGoodNumber(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
