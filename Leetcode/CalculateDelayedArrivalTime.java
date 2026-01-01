public class CalculateDelayedArrivalTime {
    public static void main(String[] args){
        int arrivalTime = 22;
        int delayedTime = 5;
        System.out.print(calculateDelayedArrivalTime(arrivalTime, delayedTime));
    }
    public static int calculateDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int totalTime = arrivalTime + delayedTime;
        if (totalTime >= 24) {
            totalTime -= 24;
        }
        return totalTime;
    }
}
