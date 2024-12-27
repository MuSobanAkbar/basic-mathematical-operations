import java.util.Scanner;

public class Subtraction

{
// the beginning number is the number that is to be subtracted.
    public static void main (String args[])
        {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many numbers would you want to subtract from the beginning number?: ");
      int iterations = scanner.nextInt();
      
      
      
      System.out.println("Choose your beginning number: ");
      int sum = scanner.nextInt();
     
      int iterationNow = 0;
      while(iterationNow<iterations)
      {
        System.out.println("Add the number you would like to subtract to  " + sum);
        int toAdd = scanner.nextInt();
        sum-=toAdd;
        iterationNow++;
        
        }
      
      System.out.println("Your final answer is: "+ sum);
    
    
        }
}