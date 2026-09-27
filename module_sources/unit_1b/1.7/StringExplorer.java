import java.util.Scanner;

public class StringExplorer
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your favorite subject?: ");
        String subject = scan.nextLine();
        String subjectLowerCase = subject.toLowerCase();
        System.out.print("Your favorite subject in lower case: ");
        System.out.println(subjectLowerCase);

        boolean contains = subjectLowerCase.contains("computer");
        System.out.print("Subject contains \"computer\": ");
        System.out.println(contains);

        // 6) Print the total length of the subject:
        int size = subjectLowerCase.length();
        System.out.print("Total length: " + size);
        
    }
}