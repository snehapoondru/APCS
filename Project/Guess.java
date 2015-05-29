
/**
 * Write a description of class Guess here.
 * 
 * @author (Sneha) 
 * @version (5/26/15)
 */
public class Guess extends Number
{
    // instance variables - replace the example below with your own
    private String g;
    private int x; 
    /**
     * Constructor for objects of class Guess
     */
    public Guess(String g)
    {
        super(g);  
    }

    /**
     * @return how many numbers in the guess are in the 
     * correct position
     */
    public int numberOfPositionsCorrect() 
    {
        int ctr = 0; 
        for (int i = 0; i < g.length(); i++)
        {
            if (g.substring(i,i+1) == getSecretNumber().substring(i,i+1))
                ctr++; 
        }
        
        if (numberOfPositionsCorrect() == getSecretNumber().length())
             System.out.println("Yay! You've guessed the secret number: " + getSecretNumber()); 
        
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
        for (int i = 0; i < g.length(); i++)
        {
            if (getSecretNumber().indexOf(g.substring(i,i+1)) != -1)
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
        if (numberOfPositionsCorrect() != getSecretNumber().length())
            return false;
        return true; 
    }

    /**
     * @return a hint that gives the player a 
     * free number at it's correct location
     */
    public String hint()
    {
        if (getNumOfHints() <= getAllowedNumOfHints())
        {
            String hint = "";  
            int position = (int) Math.random()*getSecretNumber().length();
            String numberAtPosition = getSecretNumber().substring(position, position + 1);
            hint += "The number at position " + (position + 1) + " is " + numberAtPosition + " .";
            setNumOfHints();  
            return hint;
        }
        else 
            return "No more hints left!"; 
    }
}
