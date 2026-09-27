import java.util.Scanner;

public class TrafficEngineer
{
    public static void main(String[] args)
    {
        // Get user input for the distance of the onramp
        double distance;
        System.out.print("What is the distance of the onramp? ");
        Scanner input = new Scanner(System.in);
        distance = input.nextDouble();
        
        // Calculate the time to accelerate down onramp
        double time = calculateTime(3.0, distance);
        
        // Print out results
        System.out.print("With a distance of " + distance + "m, the time to accelerate down it is: " + time + "s");
        
    }

    // Calculates and returns the time it takes for an object to accelerate
    // a distance, given the initial velocity of the object is 0
    public static double calculateTime(double acceleration, double distance)
    {
        double distanceDoubled = 2 * distance;
        return Math.sqrt(distanceDoubled/acceleration);
    }
}