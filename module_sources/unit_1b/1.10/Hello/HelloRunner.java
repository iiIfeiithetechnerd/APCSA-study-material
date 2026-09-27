import java.util.Scanner;

public class HelloRunner
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Write your code here:
        System.out.println("What is your name?");
        String name = input.nextLine();

        Hello.english(name);
        Hello.german(name);
        Hello.russian(name);

    }
}