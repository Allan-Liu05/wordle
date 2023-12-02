
/**
 * Write a description of class TestDriver_Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDriver_Board
{
    public static void main(String [] args)
    {
        Board testBoard = new Board();
        testBoard.printBoardFormated();
        System.out.println();
        testBoard.guessWord("hello", "RRRRR");
        testBoard.printBoardFormated();
    }
}
