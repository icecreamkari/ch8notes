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
        
        System.out.println("Enter a phrase: ");
        String phrase = keyboard.nextLine();
        
        palindrome symmetric = new palindrome();
        
        System.out.println(symmetric.isPalindrome(phrase));
    }
}
