import java.util.Scanner;

public class Addition

{

    public static void main (String args[])
        {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many numbers would you want to add?: ");
      int iterations = scanner.nextInt();
      
      int sum = 0;
      int iterationNow = 0;
      while(iterationNow<iterations)
       {
        System.out.println("Add the number you would like to add to " + sum);
        int toAdd = scanner.nextInt();
        sum+=toAdd;
        iterationNow++;
        
        }
      
      System.out.println("Your final answer is: "+ sum);
    
    
        }
}