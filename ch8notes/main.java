import java.util.Scanner;

public class main
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        /*
        
        System.out.println("Input an integer: ");
        int howmany = keyboard.nextInt();
       
        digits number = new digits();
        
        System.out.println(number.numdigits(howmany));
        
        System.out.println();
        */
       
        //-------------------------
        
        /*
        System.out.println("Enter a phrase: ");
        String phrase = keyboard.nextLine();
        
        palindrome symmetric = new palindrome();
        
        System.out.println(symmetric.isPalindrome(phrase));
        */
       
        //-------------------------
        
        /*
        gcd denominator = new gcd();
        
        System.out.println("Enter the 1st integer: ");
        int number1 = keyboard.nextInt();
        
        System.out.println("Enter the 2nd integer: ");
        int number2 = keyboard.nextInt();
        
        System.out.println("The greatest common denominator is " + denominator.findGCD(number1, number2));
        */
              
        //-------------------------
         
        fundraising fundraiser = new fundraising();
        
        System.out.println("Enter a monetary goal (whole dollar): ");
        int goal = keyboard.nextInt();
        
        System.out.println("You have raised a total of $" + fundraiser.collect(goal));
       
       
    }
}
