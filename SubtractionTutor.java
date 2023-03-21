import java.util.Scanner;
import java.util.Random;

// Kristof Rohaly-Medved
// CS110
// Program to quiz user on 5 subtraction questions between inputted range

public class SubtractionTutor
{
   public static void main(String [] args)
   {
      //Set up scanner and variables used for scanner
      int answer, low, high;
      Scanner input = new Scanner(System.in);
      
      //Print instructions
      System.out.println("You will supply a low value and high value, defining the range of values to be included in your quiz.");
      System.out.println("The values must be positive and no larger than 9999");
      System.out.println("I will give you 5 problems.");
      
      //Get and validate low range of values
      System.out.print("Low end of range: ");
      low = input.nextInt();
      while (low<1 || low>9999)
      {
         System.out.println("Low limit must be positive and no larger than 9999");
         System.out.print("Low end of range: ");
         low = input.nextInt();
      }
      //Get and validate high range of values
      System.out.print("High end of range: ");
      high = input.nextInt();
      while (high<low || high>9999)
      {
         System.out.println("High limit must be greater than low limit and no larger than 9999");
         System.out.print("High end of range: ");
         high = input.nextInt();
      }
      System.out.print("\n");
      
      //Set up correct counter
      int correct = 0;
      //Initiate looping quiz
      for (int count = 1; count <= 5; count++)
      {
         //Generate random numbers for subtraction
         Random rand = new Random();
         int num1 = rand.nextInt(high-low+1)+low;
         int num2 = rand.nextInt(high-low+1)+low;
         
         //is the below method for generating a random number not preferred?
         //int num1 = rand.nextInt(low, high+1);
         //int num2 = rand.nextInt(low, high+1);
         
         int higher, lower;
         
         if (num1>num2)
         {
            higher = num1;
            lower = num2;
         }
         else
         {
            higher = num2;
            lower = num1;
         }
         //Print subtraction equation
         System.out.printf("%6d\n", higher);
         System.out.print("-");
         System.out.printf("%5d\n", lower);
         System.out.println(" -----");
         //Get response and print appropriate statement depending on correctness
         System.out.print("Answer? ");
         answer = input.nextInt();
         if (answer == higher-lower)
         {
            correct++;
            System.out.println("Correct!");
         }
         else
            System.out.printf("Incorrect! The answer is %d\n",higher-lower);
         System.out.print("\n");
       }
         //Print appropriate closing statement
         System.out.println("The quiz is over");
         if (correct == 5)
            System.out.print("Excellent! You got all 5 problems correct.");
         else if (correct >= 3)
            System.out.print("You got over half correct, practice makes perfect!");
         else
            System.out.print("You got less than half correct, you need to spend more time practicing.");
   }
}