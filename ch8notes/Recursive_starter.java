//********************************************************************
//  Name
//
//  Examples
//********************************************************************

public class Recursive_starter
{

    public static void main(String[] args)
    {

        //foo(5);
        //System.out.print(sum (4));

        //System.out.println(recursiveMult(6,5)  );

        //System.out.println("exp = abc");
        //guess("abcdefg",0);

        //reverse_print("abcde");

        //int_guess(1);

        //System.out.println("The sum is " + sum (4));

        //System.out.println( btp (3,3));


        System.out.println(numbers(5));
        System.out.println(rev_numbers(5));
        System.out.println(prime(5));
        System.out.println(prime(16));


    }//end of main


    public static int btp(int a, int b)
    {
    
    
        if (b == 0)
            return 1;
        else
            return a * btp(a, b - 1);
    }
    
    public static int foo(int x)
    {
        if (x > 0)
            foo(x+1);
    
            return 0;
    }
    
    /**
     * prints a string in rever
     */
    public static void reverse_print(String s)
    {
        
        if (s.length() > 1)
        {
            reverse_print(s.substring(1));
        }
        
        System.out.print(s.charAt(0));
    
    }
    
    /**
     * prints numbers from n to 0
     */
    public static String numbers(int num)
    {
        if (num == 1)
            return "1";
        else
        {
            return num + ""  + numbers(num-1);
        }
    }
    
    /**
     * prints numbers from 0 to n
     */
    public static String rev_numbers(int num)
    {
         if (num == 0)
        {
            reverse_print(Integer.toString(num-1));
        }
        
        return Integer.toString(num);
    
    }
    
    /**
     * checks if a number is prime
     */
    public static boolean prime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    /**
     * fibonacci sequence
     */
    public static void fibonacci(int num)
    {
        
    }
    
    public static int mystery (int num)
    {
        //System.out.println(num );
        if (num == 1)
            return 1;
        else
        {
    
            return num + mystery(num-1);
    
        }
    
    
    }


}// end of class







