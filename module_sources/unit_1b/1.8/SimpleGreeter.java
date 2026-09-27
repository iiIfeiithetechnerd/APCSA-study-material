public class SimpleGreeter 
{
    public static void main(String[] args) 
    {
        String person1 = "Maria";
        String person2 = "Julian";
        
        greetEnglish(person1);

        introduce(person1, person2);
    }


    /**
    * Print the name of the name given by the parameter String name
    * Preconditions: the variable name must be a String
    * Postconditions: the output will display "Hello" next to the given name
    * @param name the given name
    */    
    public static void greetEnglish(String name) 
    {
        System.out.print("Hello ");
        System.out.println(name);
    }


    /**
    * Meet both the first and second person
    * Preconditions: the variables name1 and name2 must be Strings
    * Postconditions: the first name (name1) will meet the other name (name2)
    * @param name1 meet the first name
    * @param name2 meet the second name
    */
    public static void introduce(String name1, String name2) 
    {
        System.out.print(name1);
        System.out.print(", meet ");
        System.out.println(name2);
    }
}