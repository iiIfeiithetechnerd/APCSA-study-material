public class HomeworkTime
{
    public static void main(String[] args)
    {
        int hours = 2;
        int minutes = 30;
        int seconds = 45;
        int totalSeconds = 45;
        totalSeconds += (minutes * 60);
        totalSeconds += (hours * 3600);
        
        System.out.print("Total seconds: " + totalSeconds);
    }
}
