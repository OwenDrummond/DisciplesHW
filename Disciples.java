public class Disciples
{
    static long population = 7700000000L;
    public static void main(String [] args)
    {
        System.out.println(YearsTo(population, 2));    
        System.out.println(Multiplier(50)); 
    }
    public static int YearsTo(long total, int multiplier)
    {
        long discs = 13;
        long trainees;
        int counter = 0;
        
        while(discs < total)
        {
            trainees = discs*multiplier;
            discs = discs + trainees;
            counter = counter + 3;
        }
        return counter;
    }
    
    public static int Multiplier(int years)
    {
        int multiplier = 2;
         
        while(YearsTo(population, multiplier) > years)
        {
            multiplier++;
        }
        
        return multiplier;
    }
}
