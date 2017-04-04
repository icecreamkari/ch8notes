

public class digits
{
    //sets initial number of digits to 0
    //sets initial remainder to a number greater than 1
    int digits = 0;
    int remainder = 2;
    
    /**
     * recursive method to calculate number of digits in a number
     */
    public int numdigits(int number)
    {
       //if the remaining number is greater than one
       if (remainder >= 1)
       {
           //divide remaining number by 10
           remainder = number/10;
           //add to number of digits
           digits++;
           
           //run method again with remaining number
           numdigits(remainder);
       }
       
       //return number of digits
       return digits; 
    }
}

   