
package solve_problems.Leetcode.String_programming;
 import java.util.*;

public class Pascal_Triangle {
  

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        List<Integer> prev = row;

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentrow = new ArrayList<>();
            currentrow.add(1);
            for (int j = 1; j < i; j++) {
                currentrow.add(prev.get(j - 1) + prev.get(j));
            }
            currentrow.add(1);
            result.add(currentrow);
            prev = currentrow;
        }
        return result;
    }
}
 
}
