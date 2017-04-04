
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
}
