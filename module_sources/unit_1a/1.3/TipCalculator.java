public class TipCalculator
{
    public static void main(String[] args)
    {
        double meal = 25.99;
        double appetizer = 6.50;
        double drink = 3.99;

        double tip1=0.15;
        double tip2=0.20;
        double tip3=0.25;
        
        System.out.print("Total cost of the meal: ");
        double total = meal+appetizer+drink;
        System.out.println(total);
        System.out.print("15% tip amount: ");
        System.out.println(total*tip1);
        System.out.print("20% tip amount: ");
        System.out.println(total*tip2);
        System.out.print("25% tip amount: ");
        System.out.println(total*tip3);
        
    }
}