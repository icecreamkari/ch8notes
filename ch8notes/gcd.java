//Kathy Zhou

public class gcd
{
   //creates an initial common denominator
   int divisor;
    
   public int findGCD(int num1, int num2)
   {
       //if num1 is less than num2
       if (num1 < num2)
       {
           //calls findGCD with the numbers reversed
           findGCD(num2, num1);
       }
       //if num2 is equal to 0
       else if (num2 == 0)
       {
           //the GCD is num1
           divisor = num1;
       }    
       else
       {
           //calls GCD with num2 and the remainder of num1 and num2
           findGCD(num2, (num1%num2)); 
       }
       
       //returns the divisor
       return divisor;
   }
}


/*

OUTPUT #1
----------------------------------------
Enter the 1st integer: 
1052
Enter the 2nd integer: 
52
The greatest common denominator is 4
----------------------------------------


OUTPUT #2
----------------------------------------
Enter the 1st integer: 
15
Enter the 2nd integer: 
65
The greatest common denominator is 5
----------------------------------------


*/