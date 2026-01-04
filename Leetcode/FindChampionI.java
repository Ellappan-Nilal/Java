public class FindChampionI {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};
        System.out.println(findChampion(scores));
    }   
    public static int findChampion(int[] scores) {
        int maxScore = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
}
