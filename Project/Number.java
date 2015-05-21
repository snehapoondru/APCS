
/**
 * Number Guessing Hangman Game
 * 
 * @author (Sneha) 
 * @version (5/21/15)
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
    
    /**
     * Constructor that assigns the parameter
     * to the instance variable guess
     */
    public Number(String g)
    {
        guess = g;
    }

    /**
     * getter method
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
    
    /**
     * @return true or false depending on
     * whether the guess is correct or not
     */
    public boolean isCorrect()
    {
        if (numberOfPositionsCorrect() != secretNumber.length())
            return false;
        return true; 
    }
    
    /**
     * @return a hint that gives the player a 
     * free number at it's correct location
     */
    public String hint()
    {
        String hint = ""; 
        int position = (int) Math.random()*secretNumber.length();
        String numberAtPosition = secretNumber.substring(position, position + 1);
        hint += "The number at " + position + "is " + numberAtPosition + " ."; 
        return hint; 
    }
}
