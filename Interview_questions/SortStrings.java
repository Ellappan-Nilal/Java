import java.util.*;
public class SortStrings {
     public static void sortByComparator(String[] arr) {
        // Sort lexicographically ignoring case
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
    }

    public static void main(String[] args) {
        String[] arr = {"Abc", "Xyz", "fghfg", "adas", "tuTY", "dsa"};
        
        sortByComparator(arr);

        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
