public class Averages
{
    public static void main(String[] args)
    {
       // Write your test code here:
        double avg1 = calculateAverage(90.0, 100.0);
        double avg2 = calculateAverage(90.0, 95.0, 100.0);
        double avg3 = calculateAverage(90.0, 95.0, 97.0, 100.0);

        System.out.print(avg1 + " " + avg2 + " " + avg3);
    }

    // Calculates the average with two input doubles
    public static double calculateAverage(double a, double b) 
    {
        double num1 = a + b;
        double average1 = num1/2;

        return average1;
    }

    // Calculates the average with three input doubles
    public static double calculateAverage(double a, double b, double c) 
    {
        double num2 = a + b + c;
        double average2 = num2/3;

        return average2;
    }

    // Calculates the average with four input doubles
    public static double calculateAverage(double a, double b, double c, double d) 
    {
        double num3 = a + b + c + d;
        double average3 = num3/4;

        return average3; 
    }
}