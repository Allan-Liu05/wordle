import java.util.Scanner;
/**
 * Write a description of class TestDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDriver_ToDoWithWords
{
    public static void main(String [] Args)
    {
        Scanner ui = new Scanner(System.in); 
        ToDoWithWords wordStuff = new ToDoWithWords();
        String wordleWord = wordStuff.randomWord();
        System.out.println(wordStuff.getActualWord());
        String guess;
        while (true)
        {
            guess = ui.next();
            System.out.println(wordStuff.compare(guess));
        }
    }
}
