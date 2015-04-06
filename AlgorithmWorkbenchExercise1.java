import java.util.Scanner;
/**
 * This class allows the user to input a number, and uses a while loop to
 * calculate the product of the number until the product reaches 100.
 *
 * @author Patrick Mc Knew
 */
public class AlgorithmWorkbenchExercise1
{
    /**
     * The application where it takes place.
     */
    public static void main(String[] args)
    {
        //Variables
        Scanner keyboard = new Scanner(System.in);
        Integer num;
        Integer product = 0;

        //Get users input
        System.out.print("Input number: ");
        num = keyboard.nextInt();
        
        //Loop for calculating and displaying product
        while (product < 100)
        {
            product = num * 10;
            System.out.println(product);
            num++;
        }
    }

}
