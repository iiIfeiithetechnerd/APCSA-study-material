public class BasketballStatsTracker
{
    public static void main(String[] args)
    {
        int totalPoints = 0;
        int shotsMade = 0;
        int shotsMissed = 0;
        
        int twoPointer = 2;
        int threePointer = 3;
        int freeThrow = 1;
        
        totalPoints += twoPointer;
        shotsMade += 1;
        
        totalPoints += threePointer;
        shotsMade += 1;
        
        shotsMissed += 1;
        
        totalPoints += freeThrow;
        totalPoints += freeThrow;
        shotsMade += 2;

        shotsMissed += 1;
        
        System.out.print("Total points scored: ");
        System.out.println(totalPoints);
        System.out.print("Total shots attempted: ");
        System.out.println(shotsMade);
    }
}