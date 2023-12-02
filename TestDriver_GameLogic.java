
/**
 * Write a description of class TestDriver_GameLogic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDriver_GameLogic
{
    public static void main(String [] args)
    {
        GameLogic testDriver = new GameLogic();
        if (testDriver.guessWordTooShort("HELOOOO"))
        {
            System.out.println("Word is greater than five characters");
        }
    }
}
