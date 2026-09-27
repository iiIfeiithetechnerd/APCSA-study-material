public class HiddenMessage
{
    public static void main(String[] args)
    {
        String quote1 = "Coding like poetry";
        String quote2 = "should be short";
        String quote3 = "and concise.";
        String author = "Santosh Kalwar";
        
        //Write your code here!

        String char1 = author.substring(9, 11);
        String char2 = author.substring(1, 3);

        String char3 = quote1.substring(15, 15 + 1);
        String char4 = quote2.substring(3, 3 + 1);
        String char5 = quote1.substring(16, 16 + 1);
        String char6 = quote1.substring(3, 3 + 1);
        String char7 = quote1.substring(4, 6);

        String finalMessage = char1 + char2 + " " + char3 + char4 + char5 + char6 + char7;

        System.out.print(finalMessage);
    }
}