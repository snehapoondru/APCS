
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
        System.out.println("Enter a guess, type \"hint\" for a hint, or \"quit\" to quit: ");
        String response = scan.nextLine();
        while (!scan.nextLine().equalsIgnoreCase("quit"))
        {
            if (!scan.nextLine().equalsIgnoreCase("Hint") && response.length() == length)
            {
                Number guess = new Guess(response); 
                System.out.println("Number of Positions Correct: " + guess.numberOfPositionsCorrect());
                System.out.println("Number of Correct Numbers not in Correct Positions: " + guess.numberOfNumbersCorrect());
                System.out.println(); 
                System.out.println("Enter a guess, type \"hint\" for a hint, or \"quit\" to quit: ");
            }
            else if (scan.nextLine().equalsIgnoreCase("Hint"))
            {
                System.out.println(secret.hint()); 
            }
        }

    }
}
