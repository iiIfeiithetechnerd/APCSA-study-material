public class CalculatorRunner 
{
    public static void main(String[] args) 
    {
        // Code your calculations and print statements here:
        double slope = Calculator.slope(1, 1, 5, 10);
        double distance = Calculator.distance(2, 3, 6, 7);
        String roots = Calculator.quadRoots(1, 2, -8);

        System.out.print("Slope: " + slope);
        System.out.print("\nDistance: " + distance);
        System.out.print("\nRoots: " + roots);
    }
}