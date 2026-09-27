public class MathProgram
{
    public static void main(String[] args)
    {
        double power = Math.pow(5, 3);
        System.out.print("5^3 = ");
        System.out.println(power);

        double absolute = Math.abs(-20);
        System.out.print("Absolute value of -20 = ");
        System.out.println(absolute);

        double square = Math.sqrt(144);
        System.out.print("Square root of 144 = ");
        System.out.println(square);

        int random = (int)(Math.random() * 11) + 10;
        System.out.print("Random int between 10 and 20 = ");
        System.out.println(random);

        int floor = Math.floorDiv(5, 3);
        System.out.print("Floor of 5 and 3 = ");
        System.out.println(floor);

        int exponent = Math.getExponent(5.0);
        System.out.print("Exponent of 5 = ");
        System.out.println(exponent);

        double remainder = Math.IEEEremainder(5.0, 3.0);
        System.out.print("Remainder between 5.0 and 3.0 = ");
        System.out.println(remainder);

        long exact = Math.incrementExact(15000000000L);
        System.out.print("Exact of 15000000000L =");
        System.out.print(exact);


        /** 
        * Repeat the above structure for 4 other methods
        * from the Math class -- using it correctly and
        * then printing the value with a string that
        * describes what it is doing.
        */
    }
}