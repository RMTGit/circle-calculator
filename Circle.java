// Ramone Thompson, Oct/6th/2021, Circle.java

public class Circle
{
   //Fields
   private double radius;
   private final double PI = 3.14159;
   
   /**
      Constructor
      @param circleRad accepts the radius of the circle from the user.
   */
   public Circle(double circleRad)
   {
      radius = circleRad;
   }
   
   //======================================================================
   
   /**
      No-arg Constructor
   */
   public Circle()
   {
      radius = 0.0;
   }
   
   //======================================================================
   
   /**
      The setRadius method sets the radius of the circle object.
      @param circleR accepts the radius of the circle as a double.
   */
   public void setRadius(double circleR)
   {
      radius = circleR;
   }
   
   //======================================================================
   
   /**
      The getRadius method returns the radius of the circle object as 
      a double value to the program that called it.
   */
   public double getRadius()
   {
      return radius;
   }
   
   //======================================================================
   
   /**
      The getArea method calculates and returns the area of the circle object.
   */
   public double getArea()
   {
      return PI * radius * radius;
   }
   
   //======================================================================
   
   /**
      The getDiameter method calculates and returns the diameter of the 
      circle object.
   */
   public double getDiameter()
   {
      return radius * 2;
   }
   
   //======================================================================
   
   /**
      The getCircumference method calculates and returns the circumference
      of the circle object.
   */
   public double getCircumference()
   {
      return 2 * PI * radius;
   }
}