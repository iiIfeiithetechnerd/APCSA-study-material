public class MysteryMethodChange
{
    public static void main(String[] args)
    {
        int number = 11;
        int mysteryNum = mysteryMethod(number);
        number += mysteryNum;
        System.out.println(number);
    }

    // A mystery method that prints out a mystery calculation
    public static int mysteryMethod(int num)
    {
        return num * 15;
    }
}