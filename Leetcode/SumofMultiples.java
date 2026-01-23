public class SumofMultiples {
    public static void main(String[] args){
        int n=10;
        System.out.print(sumOfMultiples(n));
    }
    public static int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
    public int sumOfMultiples2(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){s
                sum+=i;
            }
        }
        return sum;
    }
}
