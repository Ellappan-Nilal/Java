public class ConvertTemperature {
    public static void main(String[] args){
        double cels=23;
        System.out.print(onverttemp(cels);)

    }
    public double[] converttemp(double cels){
        double ans[]=new double[2];
        double kel=cels+273.15;
        double farn=(cels*1.80)+32.00;
        ans[0]=kel;
        ans[1]=farn;
        return ans;
    }
}
