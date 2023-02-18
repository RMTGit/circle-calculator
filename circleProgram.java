// Ramone Thompson, Oct/6th/2021, circleProgram.java

/**
 * --WHAT THIS PROGRAM WILL DO--
 * 1.) Ask the user to input the radius of a circle.
 * 2.) Print out the circle's area, diameter, and circumference based on the user's radius input.
 * 3.) Ask the user if they would like to calculate the area, diameter, and circumference of another circle.
 * 4.) If the user says yes, store the previous Circle object in an ArrayList and create another Circle object.
 * 5.) If the user says no, print out all of the Circle objects the user input and end the program.
 */


import java.util.Scanner; //Used to get input from the user
import java.util.ArrayList; //Used to store circle objects

public class circleProgram
{
   public static void main(String[] args)
   {
      //Create new scanner object for user input.
      Scanner keyboard = new Scanner(System.in);
      
      //Declare an ArrayList for all of the Circle objects to be stored in.
      ArrayList<Circle> circleList = new ArrayList<Circle>();
      
      //Declare a String object called run and set it to hold Yes.
      String run = "Yes";
      
      while (run.equalsIgnoreCase("Yes"))
      {
         double circleRadius = 0.0; //Holds the radius of the circle.
         
         //Prompt the user and get their input.
         System.out.print("\nEnter the radius of the circle: ");
         circleRadius = keyboard.nextDouble();
         
         //Validate the user's input.
         while (circleRadius < 0)
         {
            //Display error message.
            System.out.println("===ERROR: Enter a non-negative number please===\n");
            
            //Allow the user to correct input.
            System.out.print("\nEnter the radius of the circle: ");
            circleRadius = keyboard.nextDouble();
         }
         
         //Create a new Circle object and store it in an ArrayList object.
         Circle theCircle = new Circle(circleRadius);
         circleList.add(theCircle);
         
         //Display the circle's area, diameter, and circumference.
         System.out.printf("\nThe circle's area is %,.2f", theCircle.getArea());
         System.out.printf("\nThe circle's diameter is %,.2f", theCircle.getDiameter());
         System.out.printf("\nThe circle's circumference is %,.2f", theCircle.getCircumference());
         
         //Ask the user if they would like to enter another radius and get their input.
         System.out.print("\n\nWould you like to enter the radius for another circle? (Yes/No): ");
         
         //Consume newline character.
         keyboard.nextLine();
         
         run = keyboard.nextLine();
         
      }
      
      //Display all circle fields by iterating over the ArrayList.
      for (int i = 0; i < circleList.size(); i++)
      {
         System.out.print("\n\nCircle " + (i + 1));
         System.out.printf("\nArea: %,.2f", circleList.get(i).getArea());
         System.out.printf("\nDiameter: %,.2f", circleList.get(i).getDiameter());
         System.out.printf("\nCircumference: %,.2f", circleList.get(i).getCircumference());
      }
   }
}