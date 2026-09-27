public class IntegerOverflow
{
    public static void main(String[] args)
    {
        System.out.println("Min value: " + Integer.MIN_VALUE);
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Underflow: " + (Integer.MIN_VALUE - 1));
        System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
        System.out.println("Min value divided by 2: " + (Integer.MIN_VALUE / 2));
        System.out.println("Max value multiplied by 2: " + (Integer.MAX_VALUE * 2));
    }
}