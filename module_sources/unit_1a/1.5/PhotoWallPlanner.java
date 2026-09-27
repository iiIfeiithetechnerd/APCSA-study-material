import java.util.Scanner;

public class PhotoWallPlanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wallHeight = 8*12;
        System.out.println("What is the height of each picture?");
        int height = input.nextInt();

        double totalRows = (double) wallHeight / height;
        System.out.println("Total rows (including partial rows): " + totalRows);

        int completeRows = wallHeight / height;
        System.out.println("Complete rows: " + completeRows);

        int leftoverInch = wallHeight % height;
        System.out.println("Inches leftover: " + leftoverInch);
    }
}