
/**
 * Write a description of class Project here.
 * 
 * @author (Sneha) 
 * @version (5/14/15)
 */
public class Number
{
    private String secretNumber = "";

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
    
    public Number

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return the secretNumber
     */
    public String getSecretNumber()
    {
        return secretNumber;
    }
}
