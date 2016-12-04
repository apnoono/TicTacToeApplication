/**
 * Created by Andy on 12/3/2016.
 */
package tictactoeapplication;

public class TicTacToeApplication {
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //TO DO: code application logic here
        TicTacToe myGame = new TicTacToe('a', 'c');
        myGame.printBoard();
    }
}
