import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double scoopPrice = 2.50;
        System.out.println("What flavor ice cream would you like?");
        String flavor = input.nextLine();
        System.out.println("How many scoops would you like?");
        int scoops = input.nextInt();
        double total = scoops * scoopPrice;

        System.out.print("Order summary: \nFlavor: " + flavor + "\nNumber of Scoops: " + scoops + "\nTotal:" + total);
    }
}