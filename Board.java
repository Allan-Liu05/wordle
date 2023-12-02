
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    private int turn = 0;
    private String [][] wordleBoard = new String [6][11];
    public Board()
    {
        for (int r = 0; r < this.wordleBoard.length; r++)
        {
            for (int c = 0; c < this.wordleBoard[0].length; c++)
            {
                wordleBoard[r][c] = " ";
            }
        }
    }

    int getTurn()
    {
        return this.turn;
    }

    void printBoard()
    {
        for (int r = 0; r < this.wordleBoard.length; r++)
        {
            for (int c = 0; c < this.wordleBoard[0].length; c++)
            {
                System.out.print(this.wordleBoard[r][c]);
            }
            System.out.println();
        }
    }

    void printBoardFormated()
    {
        for (int r = 0; r < this.wordleBoard.length; r++)
        {
            System.out.println("+-+-+-+-+-+ +-+-+-+-+-+");
            System.out.print("|");
            for (int c = 0; c < this.wordleBoard[0].length; c++)
            {
                System.out.print(this.wordleBoard[r][c] + "|");
            }
            System.out.println();
        }
        System.out.println("+-+-+-+-+-+ +-+-+-+-+-+");
    }

    void guessWord(String gGuess, String gCorrectness)
    {
        for (int x = 0; x < 5; x++)
        {
                this.wordleBoard[turn][x] = gGuess.substring(x, x + 1).toUpperCase();
                this.wordleBoard[turn][x + 6] = gCorrectness.substring(x, x + 1).toUpperCase();
        }
        turn++;
    }
}
