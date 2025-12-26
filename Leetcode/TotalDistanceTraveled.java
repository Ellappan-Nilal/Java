public class TotalDistanceTraveled {
    public static void main(String[] args) {
        int mainTank = 5;
        int additionalTank = 10;
        int distance = totalDistance(mainTank, additionalTank);
        System.out.println("Total Distance Traveled: " + distance + " miles");
    }

    public static int totalDistance(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            distance += 10;
            mainTank--;

            if (distance % 50 == 0 && additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }
        }
        return distance;
    }
}
