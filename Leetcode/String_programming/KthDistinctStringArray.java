package String_programming;

public class KthDistinctStringArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }       
    }
    public String kthDistinct(String[] arr, int k) {
        int distinctCount = 0;

        for (String str : arr) {
            if (isDistinct(arr, str)) {
                distinctCount++;
                if (distinctCount == k) {
                    return str;
                }
            }
        }
        return "";
    }   
}
