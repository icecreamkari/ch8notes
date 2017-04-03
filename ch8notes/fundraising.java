
public class fundraising
{
    int total = 1;
    
    public int collect(int monetaryGoal)
    {
        if (total <= monetaryGoal)
        {
            total *= 10;
            return collect(monetaryGoal-total);
        }
        
        return total;
    }
    
    public static void main(String[] args)
    {
        collect(1000);
        
    }//end of main
}
