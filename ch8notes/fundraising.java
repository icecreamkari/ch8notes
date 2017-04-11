//Kathy Zhou

public class fundraising
{
    //sets initial total and people asked to 0
    int total = 0;
    int peopleAsked = 0;
    
    public int collect(int monataryGoal)
    {
        //if the monataryGoal is greater than $10
        if (monataryGoal > 10 )
        {
            //divides the monetary goal by 10
            monataryGoal /= 10;
            
            //for loop to simulate asking 10 people
            for(int i= 0; i < 10 ;i++)
            {
                //add 1 to people asked and total
                peopleAsked++;
                total++;
                
                //prints the number of people asked
                System.out.println("Total number of people that have beed asked: " + peopleAsked  );
                
                //calls collect again with the new monetary goal
                //keeps calling until goal will be less than $10
                collect(monataryGoal);
            }
        }
        //if the monataryGoal is less than $10
        else
        {
            //add the monataryGoal left to the total number of people that will be asked
            peopleAsked += monataryGoal;
            //add to total remaining monataryGoal to be collected
            total+= monataryGoal;
            
            //prints the number of people asked
            System.out.println("Total number of people that have beed asked: " + peopleAsked  );
        }
      
        return total;
    }
}


/*
Output
Enter a monetary goal (whole dollar): 
1000

(line below repeats from 1 - 110)
Total number of people that have beed asked: 1110

You have raised a total of $1110
 */