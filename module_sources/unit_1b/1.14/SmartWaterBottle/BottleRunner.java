public class BottleRunner 
{
    public static void main(String[] args) 
    {
        WaterBottle waterBottle1 = new WaterBottle(1.0, 0.6);
        waterBottle1.drink(0.2);
        waterBottle1.drink(0.4);
        waterBottle1.refill(1.0);
        waterBottle1.drink(0.5);
        waterBottle1.refill(0.1);
        System.out.println(waterBottle1);

    }
}