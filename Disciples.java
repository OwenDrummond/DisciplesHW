public class Disciples
{
    // Total population variable.
    static long population = 7700000000L;
    public static void main(String [] args)
    {
        System.out.println(YearsTo(population, 2));    
        System.out.println(Multiplier(50)); 
    }
    // Function to calculate years takes in the population size and the multiplier by which we increase form the starting value. 
    public static int YearsTo(long total, int multiplier)
    {
        long discs = 13;
        long trainees;
        int counter = 0;

        // As long as the amount of disciples on the Earth is less than the total population...
        while(discs < total)
        {
            // Each dsiciple can make two more in a year.
            trainees = discs*multiplier;
            // The new amount of disciples equals the old amount plus the amount they created in this cycle. 
            discs = discs + trainees;
            // Everytime this runs, the counter tracks the amount of years it took (3). 
            counter = counter + 3;
        }
        return counter;
    }

    // The multiplier function takes in the amount of years we would like it to take to reach a goal population. 
    public static int Multiplier(int years)
    {
        int multiplier = 2;

        // While the multipler creates the desired population too slow...
        while(YearsTo(population, multiplier) > years)
        {
            // Increase the multiplier and try again. 
            multiplier++;
        }
        
        return multiplier;
    }
}
