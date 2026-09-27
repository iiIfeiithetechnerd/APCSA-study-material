import java.util.Scanner;

public class Intros
{
    public static void main(String[] args)
    {
        // Write your code here:
        String name;
        int gradeLevel;
        String funFact;
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("What grade are you in?");
        gradeLevel = input.nextInt();

        input.nextLine();

        System.out.println("What is a fun fact about yourself?");
        funFact = input.nextLine();

        printIntroduction(name, gradeLevel, funFact);
        
    }
    
    public static void printIntroduction(String name, int grade, String fact) 
    {
        // Complete this method
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fun Fact: " + fact);
    }
}