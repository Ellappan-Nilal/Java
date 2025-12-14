package solve_problems.Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneweight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        LastStoneweight obj = new LastStoneweight();
        int result = obj.lastStoneWeight(stones);

        System.out.println("Last Stone Weight: " + result);
    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;   // Max-heap
            }
        });
        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int stone1 = pq.poll();  // heaviest
            int stone2 = pq.poll();  // second heaviest

            if (stone1 != stone2) {
                pq.add(stone1 - stone2);
            }
        }
        if (pq.isEmpty()) {
            return 0;
        }

        return pq.poll();
    }
}
