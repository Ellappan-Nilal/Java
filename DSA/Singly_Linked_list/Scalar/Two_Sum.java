package solve_problems.DSA.Singly_Linked_list.Scalar;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args){
        int[] arr = {11, 3, 7, 9, 14, 2};
        int target = 17;
        int[] re = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int sno = target - arr[i];
            if(map.containsKey(sno)){
                re[0] = map.get(sno);
                re[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        System.out.println("Indices: " + re[0] + ", " + re[1]);
        System.out.println("Values: " + arr[re[0]] + ", " + arr[re[1]]);
    }
}
