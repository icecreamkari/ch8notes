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
        return Integer.toString(num);
    else
    {
        return 0 + "" + numbers(num-(num-1));
    }
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






