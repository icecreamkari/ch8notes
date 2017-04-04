public class palindrome
{
   //sets initial position to 0
    int position = 0;
    boolean same = false;

   public boolean isPalindrome(String sentence)
   {
        //deletes all the spaces in the string
        String nospace = sentence.replaceAll(" ", "");
        
        //sets char at front and back
        char front = nospace.charAt(position);
        char back = nospace.charAt((nospace.length()-1)-(position));
        
        //compares chars to see if they're the same
        if(front == back)
        {
            //if positon overlapped, is a palindrome
            if (position >= ((nospace.length()-1)))
            {
                same = true;
                return same;
            }
            
            //compares again by calling the method
            position++;
            isPalindrome(sentence);
        }        
        
        //if comparison failed, not a palindrome
        return same;
   }
}
