package String_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KthDistinctStringArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int k = sc.nextInt();
        sc.close();

        String ans = kthDistinct(arr, k);
        System.out.println(ans);
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String s : arr) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }

        int distinctCount = 0;
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return e.getKey();
                }
            }
        }
        return "";
    }
}
