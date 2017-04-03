
public class palindrome
{
   String word, another;
   int left, right;
   
   public palindrome(String check)
   {
       word = check;
       another = check;
       left = 0;
       right =  word.length() - 1;
   }
    
   public boolean isPalindrome(int left, int right)
   {
       while(another.equalsIgnoreCase(word))
       {
           while (word.charAt(left) == word.charAt(right) && left < right)
                isPalindrome(left++, right--);
                
           if(left < right)
                return true;
           else
                return false;
        }
   }
}
