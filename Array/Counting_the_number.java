import java.util.*;
public class Counting_the_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			boolean isduplicate=false;
			int cnt=0;
			for(int j=0; j<i; j++) {//To eliminate duplicates
				if(a[i]==a[j]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				for(int k=0; k<n; k++) {
					if(a[i]==a[k]) {
						cnt++;
					}
				}
				System.out.println(a[i]+" - "+cnt);
			}
		}
	}
}





