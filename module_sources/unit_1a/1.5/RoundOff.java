public class RoundOff
{
    public static void main(String[] args)
    {
        double dollarConv =  0.034567;
        int conversionDollar = 100000;
        double solariAmount = (double) conversionDollar * dollarConv;
        System.out.println("Amount converted: " + solariAmount);
    }
}