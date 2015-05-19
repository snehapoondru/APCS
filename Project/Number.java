
/**
 * Write a description of class Project here.
 * 
 * @author (Sneha) 
 * @version (5/14/15)
 */
public class Number
{
    private String secretNumber = "";
    private String guess = ""; 

    /**
     * Constructor that creates a random number
     * of the specified length
     */
    public Number(int length)
    {
        for (int x = 0; x < length; x++)
        {
            secretNumber += (int) (Math.random()*10);
        }
    }
    
    public Number(String g)
    {
        guess = g;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return the secretNumber
     */
    public String getSecretNumber()
    {
        return secretNumber;
    }
    
    /**
     * @return how many numbers in the guess are in the 
     * correct position
     */
    public int numberOfPositionsCorrect()
    {
        int ctr = 0; 
        for (int i = 0; i < guess.length(); i++)
        {
            if (guess.substring(i,i+1) == getSecretNumber().substring(i,i+1))
                ctr++; 
        }
        return ctr; 
    }
    
    /**
     * @return how many numbers in the guess are
     * in the secret number, but not necessarily in
     * the correct position
     */
    public int numberOfNumbersCorrect()
    {
        int ctr = 0;
        for (int i = 0; i < guess.length(); i++)
        {
            if (getSecretNumber().indexOf(guess.substring(i,i+1)) != -1)
                ctr++;  
        }
        return ctr; 
    }
}
