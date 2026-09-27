public class BankAccount 
{
    public static void main(String[] args) 
    {
        // Create an account with an initial balance of $100
        double myAccount = 100;

        // Print the current balance
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Add 50 dollars to the account
        myAccount = myAccount + 50;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Remove 30 dollars from the account
        myAccount = myAccount - 30;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Remove 150 dollars from the account
        myAccount = myAccount - 150; 
        System.out.print("Current balance: $");
        System.out.println(myAccount);
    }
}