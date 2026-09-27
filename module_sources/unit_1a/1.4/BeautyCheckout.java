public class BeautyCheckout
{
    public static void main(String[] args)
    {
        double bathSoap = 20.99;
        double lotion = 15.99;
        double chapstick = 5.99;
        double discount = 0.25;

        double total = bathSoap + lotion + chapstick;
        System.out.println("Without discount: " + total);
        
        double discountedTotal = total * discount;
        System.out.println("Discount amount: " + discountedTotal);
        
        double discountedTotalFinal = total - discountedTotal;
        System.out.println("Discounted price: " + discountedTotalFinal);
        
        System.out.println("Thanks for supporting Vivid Beauty!");
        System.out.println("Here is a summary of your purchase:\n");
        System.out.println(discountedTotalFinal);
        
    }
}