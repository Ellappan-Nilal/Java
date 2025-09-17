
package solve_problems.Pattern.Number;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 
 * Cache capacity: 3
 Number of pages: 7
Page sequence: 1 2 3 4 2 1 5
 */

public class Least_Recently_Used {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cache capacity: ");
        int S = scanner.nextInt();
        System.out.print("Enter number of pages: ");
        int N = scanner.nextInt();
        int[] pages = new int[N];

        System.out.println("Enter page sequence:");
        for (int i = 0; i < N; i++) {
            pages[i] = scanner.nextInt();
        }

        Set<Integer> cache = new LinkedHashSet<>();
        int missCount = 0;

        for (int page : pages) {
            if (!cache.contains(page)) {
                missCount++;
                if (cache.size() == S) {
                    Iterator<Integer> iterator = cache.iterator();
                    cache.remove(iterator.next());
                }
                cache.add(page);
            } else {
                cache.remove(page);
                cache.add(page); // Update LRU order
            }
        }
        System.out.println("Miss count: " + missCount);
    }
}

