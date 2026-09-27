public class SystemRunner
{
    public static void main(String[] args)
    {
        // Create a library, book, and member object:
        Book book1 = new Book("Toilet Bound Hanako Kun", "Aidalro", 300);
        Library mainLibrary = new Library("My Library", "Random city", 10000);
        Member member1 = new Member("Alice Megatroid", 10891090, false);

        // Print out each object:
        System.out.println(book1);
        System.out.println(mainLibrary);
        System.out.println(member1);
    }
}