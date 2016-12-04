package tictactoeapplication;

/**
 * Created by Andy on 12/3/2016.
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiToken) {
        userMarker = playerToken;
        aiMarker = aiToken;
        winner = '-';
        this.board = setBoard();
    }

    public static char[] setBoard(){
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int x){
        boolean isValid = isValidSpot(x) && !isSpotTaken(x);
        if(isValid){
            board[x - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }
    //if user input is between 1 and 9, we're in business!
    public boolean isValidSpot(int x){
        return x > 0 && x < board.length + 1;
    }

    public boolean isSpotTaken(int x){
        return board[x - 1] != '-';
    }

    public void printBoard(){
        System.out.println();
        for(int i = 0; i < board.length; i++){
            if(i % 3 == 0 && i != 0){
                System.out.println();
                System.out.println("____________________");

            }
            System.out.print(" | " + board[i] + " | ");
        }
    }
}