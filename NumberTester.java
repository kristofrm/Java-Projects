//Kristof Rohaly-Medved
//CS110
//Program to test characteristics of numbers from input file and print results to output file

import java.util.Scanner;
import java.io.*;

public class NumberTester
{
   public static void main(String[] args) throws IOException
   {
      //Set up input file for reading
      File myfile = new File("NumberTesterInput.txt");
      Scanner inputfile = new Scanner(myfile);
      
      //Initiate variables for output formatting
      String rep;
      String even;
      String prime;
      //Write header for output formatting
      PrintWriter pw = new PrintWriter("numberSummary.txt");
      rep = "Repeat";
      pw.printf("%13s\n", rep);
      pw.print("Number Digits   Even  Prime\n");
      
      //Loop testing number characteristics
      while (inputfile.hasNext())
      {
         //Read number
         int num = inputfile.nextInt();
         //Check for repeat adjacent digits
         if (isRepeatedDigits(num))
            rep = "+";
         else
            rep = "-";
         //Check if even
         if (isEven(num))
            even = "+";
         else
            even = "-";
         //Check if prime
         if (isPrime(num))
            prime = "+";
         else
            prime = "-";
         
         //Write characteristics to output file
         pw.printf("%4d", num);
         pw.printf("%7s", rep);
         pw.printf("%7s", even);
         pw.printf("%7s\n", prime);
      }
      //Close input and output file once completed
      inputfile.close();
      pw.close();
      System.out.print("Table successfully printed to numberSummary.txt");
   }
   
   public static boolean isRepeatedDigits(int num) //Method checking for repeated adjacent digits
   {
      //@param num number for testing from file 
      //Turn integer number into string
      String s = String.valueOf(num);
      int length = s.length();
      int count = 0;
      boolean isRep = false;
      
      //Check if adjacent digits are the same within index range of number
      while (count < length-1)
      {
         if (s.charAt(count) == s.charAt(count+1)) 
            isRep = true;
         count++;
      }
      return isRep;
      //@return isRep boolean variable for adjacent digits
   }
   
   public static boolean isEven(int num) //Method checking if number is even
   {
      //@param num number for testing from file 
      boolean even = false;
      if (num%2 == 0)
         even = true;
      return even;
      //@return even boolean variable for if number is even
   }
   
   public static boolean isPrime(int num) //Method checking if number is prime
   {
      //@param num number for testing from file 
      boolean prime = false;
      for (int count = 2; count < num/2; count++)
      {
         if (num%count == 0)
         {
            return prime = false;
            //@return prime boolean variable for if number is prime
         }
         else
            prime = true;
      }
      return prime;
      //@return prime boolean variable for if number is prime
   }      
}