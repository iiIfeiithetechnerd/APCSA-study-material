public class StringObjects
{
    public static void main(String[] args)
    {
        // Part 1: Create two string variables and a third that
        // references the first:

        String stringOne = "Hello";
        String stringTwo = "Friend!";
        String stringThree = stringOne;


        // Part 2: Assign a new value to stringOne variable:
        stringOne = "How are you?";
        

        // Part 3: Print out the values of all three string variables:
        System.out.print(stringOne);
        System.out.print("\n" + stringTwo);
        System.out.print("\n" + stringThree);


    }
}