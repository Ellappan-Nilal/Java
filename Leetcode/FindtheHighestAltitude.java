public class FindtheHighestAltitude {
    public static void main(String[] args){
        int[] gain={-5,1,5,0,-7};
        int result=findHighestAltitude(gain);
        System.out.println("Highest Altitude: " + result);
    }
    public static int findHighestAltitude(int[] gain) {
        int highestAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        return highestAltitude;
    }
}
