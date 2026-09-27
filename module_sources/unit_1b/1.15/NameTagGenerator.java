import java.util.Scanner;

public class NameTagGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = input.nextLine();
        System.out.print("Enter a name: ");
        String name2 = input.nextLine();
        displayNameTag(name1);
        displayNameTag(name2);

        boolean isEqual = getNameChecked(name1, name2);
        System.out.println("Are the two names the same?: " + isEqual); 
    }
    
    
    /* Takes in a person's name and then 
    * prints a nametag, which includes the following:
    * Name
    * Number of characters in the name
    * Last letter in the name
    */
    public static void displayNameTag(String name)
    {
        int stringLength = name.length();
        char lastLetter = name.charAt(stringLength - 1);
        System.out.println("****************");
        System.out.println("Name: " + name);
        System.out.println("Length: " + stringLength + " characters");
        System.out.println("Last letter: " + lastLetter);
        System.out.println("****************");
    }

    public static boolean getNameChecked(String n1, String n2)
    {
        if (n1.equals(n2))
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}