import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        System.out.println("Enter the author's name as 'Last name, First name': ");
        Scanner scan = new Scanner(System.in);
        String lastName = scan.nextLine();

        System.out.println("Enter the year the book was published: ");
        int year = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the title of the book: ");
        String bookName = scan.nextLine();

        System.out.println("Enter the publisher of the book: ");
        String publisher = scan.nextLine();

        System.out.println(lastName + ". " + bookName + ". \n" + publisher + ", " + year + ".");

        scan.close();
    }
}