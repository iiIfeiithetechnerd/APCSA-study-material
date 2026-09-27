public class BalloonRunner 
{
    public static void main(String[] args) 
    {
        // Create two balloon objects
        Balloon balloon1 = new Balloon(10.8, "Purple");
        Balloon balloon2 = new Balloon(5.4, "Orange");

        // Print out initial information of each balloon
        System.out.println(balloon1);
        System.out.println(balloon2);
        
        // Inflate first balloon
        balloon1.inflate(10);
        balloon2.inflate(20.8);
        
        // Change the color of second balloon
        balloon1.changeColor("silver");
        balloon2.changeColor("Cyan");

        // Print out final information of each balloon
        System.out.println(balloon1);
        System.out.println(balloon2);
    }
}