
/**
 * Write a description of class Guess here.
 * 
 * @author (Sneha) 
 * @version (5/18/15)
 */
public class Guess extends Number 
{
    // instance variables - replace the example below with your own
    private String guess;

    /**
     * Constructor for objects of class Guess
     */
    public Guess(String g)
    {
        guess = g;    
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
        for (int i = 0; i < guess.length; i++)
        {
            if (getSecretNumber().indexOf(guess.substring(i,i+1)) != -1)
                ctr++;  
        }
        return ctr; 
    }
}
