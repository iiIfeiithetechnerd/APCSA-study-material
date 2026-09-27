import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
       System.out.println("Enter movie rating (as a decimal)");
       Scanner input = new Scanner(System.in);
       double valEntered = input.nextDouble();
       int valRounded = (int) (valEntered + 0.5);
       System.out.print("Rating rounded: " + valRounded);
    }
}
