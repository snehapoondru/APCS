
/**
 * @author (Sneha) 
 * @version (5/27/15)
 */
import java.util.Scanner;
public class Runner
{
    public static void main (String args[])
    {
        System.out.println("Welcome to a game of number hangman! Enter the length of the number you wish to guess: "); 
        Scanner scan = new Scanner(System.in); 
        int length = scan.nextInt();
        Number secret = new Number(length); 
        System.out.println("Enter guess or type 'hint' for a hint"); 
        if (scan.nextLine() != ("Hint") && scan.nextLine().length() == length)
        {
            Number guess = new Guess(scan.nextLine()); 
            System.out.println("Number of Positions Correct: " + guess.numberOfPositionsCorrect());
            System.out.println("Number of Correct Numbers not in Correct Positions: " + guess.numberOfNumbersCorrect()); 
        }
        else if (scan.nextLine() == "Hint")
        {
            secret.hint(); 
        }
    }

}
