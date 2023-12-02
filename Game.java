import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main(String [] args)
    {
        ToDoWithWords toDoWithWords = new ToDoWithWords();
        GameLogic gameLogic = new GameLogic();
        Board board = new Board();
        Scanner ui = new Scanner(System.in);

        String actualWord = toDoWithWords.randomWord();
        boolean startYay = false;
        boolean lose = true;
        boolean isThisANumber = true;
        
        System.out.println("WELCOME TO WORDLE");
        System.out.println("Here are the rules:");
        System.out.println("1. Guesses need to be exactly five characters");
        System.out.println("2. Guesses cannot have special characters or numbers");
        System.out.println("3. Upon guessing, a string of five characters will appear consisting of");
        System.out.println("three unique characters: R, Y, G");
        System.out.println("R means that the character at that spot is not in the word");
        System.out.println("Y means that the character at that spot is in the word but not in that location");
        System.out.println("G means that the character at that spot is in the word and in that location");
        System.out.println("Press Y to start");
        while(true)
        {
            String start = ui.next();
            if (start.equalsIgnoreCase("y"))
            {
                startYay = true;
                break;
            }
        }
        
        mainLoop:
        while(startYay)
        {
            System.out.println("Please guess a word");
            String guess = ui.next();
            if(!gameLogic.isNumber(guess))
            {
                System.out.println("Numbers aren't allowed idiot.");
                isThisANumber = false;
            }
            if (isThisANumber)
            {
                if (gameLogic.isValid(guess))
                {
                    if (gameLogic.didIWin(toDoWithWords.compare(guess)))
                    {
                        board.guessWord(guess, toDoWithWords.compare(guess));
                        board.printBoardFormated();
                        System.out.println("GG GAMER: YOU WIN!!!!!!!");
                        break mainLoop;
                    }
                    board.guessWord(guess, toDoWithWords.compare(guess));
                    board.printBoardFormated();
                    if (gameLogic.didIWin(toDoWithWords.compare(guess)))
                    {
                        board.guessWord(guess, toDoWithWords.compare(guess));
                        board.printBoardFormated();
                        System.out.println("GG GAMER: YOU WIN!!!!!!!");

                        break mainLoop;
                    }
                    if (board.getTurn() == 6)
                    {
                        board.printBoardFormated();
                        System.out.println("YOU LOSE");
                        System.out.println("The word was: " + toDoWithWords.getActualWord());
                        break mainLoop;
                    }
                }
                else
                {
                    System.out.println("Guess word invalid");
                    System.out.println();
                }
            }
        }
    }
}

