
/**
 * Write a description of class GameLogic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLogic
{
    public GameLogic()
    {
    }
    boolean guessWordLengthInvalid(String gWord)
    {
        if (gWord.length() == 5)
        {
            return true;
        }
        return false;
    }
    
    boolean guessWordNoNumber(String gWord)
    {
        String [] forbiddenNumbers = {"0","1","2","3","4","5","6","7","8","9"};
        for (int x = 0; x < gWord.length(); x++)
        {
            for (int y = 0; y < forbiddenNumbers.length; y++)
            {
                if (gWord.substring(x, x + 1).equals(forbiddenNumbers[y].toString()))
                return false;
            }
        }
        return true;
    }
    boolean guessWordNotSpecial(String gWord)
    {
        String [] forbiddenCharacters = {"!","@","#","$","%","^","&","*","(",")","-","_","=","+","[","]","{","}","'\'","|",";",":",",","<",".",">","/","?","'"};
        char forbiddenQuotation = '"';
        for (int x = 0; x < gWord.length(); x++)
        {
            for (int y = 0; y < forbiddenCharacters.length; y++)
            {
                if (gWord.substring(x, x + 1).equals(forbiddenCharacters[y].toString()) || gWord.substring(x, x + 1).equals(forbiddenQuotation))
                return false;
            }
        }
        return true;
    }
    boolean isValid(String gGuess)
    {
        if (this.guessWordNotSpecial(gGuess) && this.guessWordLengthInvalid(gGuess) && this.guessWordNoNumber(gGuess))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    void getWhitespace()
    {
        for (int x = 0; x < 5; x++)
        {
            System.out.println();
        }
    }
    boolean didIWin(String checkWin)
    {
        if (checkWin.equalsIgnoreCase("GGGGG"))
        {
            return true;
        }
        return false;
    }
    boolean isNumber(String gGuess)
    {
        try
        {
            gGuess.length();
        }
        catch (Exception e)
        {
            return false;
        }
        finally 
        {
            return true;
        }
    }
}
