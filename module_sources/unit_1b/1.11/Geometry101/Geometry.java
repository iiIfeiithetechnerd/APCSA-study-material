package Geometry101;

public class Geometry
{
    public static double pi = 3.14159265358979;
    // Calculates and returns the area of a circle with the input radius
    public static double getCircleArea(double radius)
    {
        double radiusSquared = Math.pow(radius, 2);

        return pi * radiusSquared;
        
    }
    
    // Calculates and returns the volume of a sphere with the input radius
    public static double getSphereVolume(double radius)
    {
        double radiusCubed = Math.pow(radius, 3);
        return (4.0/3) * pi * radiusCubed;
        
    }
}