public class Sequential_order {

	public static void main(String[] args) {
		Scanner sc=new Sccaner(System.in);
		int n=sc.nextInt();
		int term=1;
		for(int i=1;i<=n;i++){
		    System.out.print(term);
		    if(i<n){
		        System.out.print(", ");
		    }
		}
		term*=2;
	}
}


