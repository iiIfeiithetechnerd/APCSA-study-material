public class CameraRunner 
{
    public static void main(String[] args) 
    {
       // Create at least 3 camera objects and print them out
       Camera camera1 = new Camera("film", 10);
       Camera camera2 = new Camera(50, 20);
       Camera camera3 = new Camera(48, 3);
       
       System.out.println(camera1);
       System.out.println(camera2);
       System.out.println(camera3);
       
    }
}