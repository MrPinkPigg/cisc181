/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_6;

public class TicTacToeTypeGame {
    private GameBoard board;
    private char turn;
    private char notTurn;
    private int numRows;
    private int numCols;
    private int numConsecToWin;

    /*
    sets up an empty array with set bounds
     */
    public static GamePiece[][] setUpEmptyArray(int row, int col){
        GamePiece tempArray [][] = new GamePiece[row][col];
        for(int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                tempArray[i][k] = new GamePiece(GamePiece.EMPTY);
            }
        }

        return tempArray;
    }

    /*
    constructor for a tictactoe game
     */
    public TicTacToeTypeGame(char turnSymbol, char notTurnSymbol, int numRows, int numCols, int numConsecToWin){
        this.turn = turnSymbol;
        this.notTurn = notTurnSymbol;
        this.numRows = numRows;
        this.numCols = numCols;
        this.numConsecToWin = numConsecToWin;

        this.board = new GameBoard(setUpEmptyArray(numRows, numCols));
    }

    /*
    getters
     */
    public GameBoard getGameBoard() { return this.board; }
    public char getTurn() { return this.turn; }
    public char getNotTurn() { return this.notTurn; }
    public int getNumRows() { return this.numRows; }
    public int getNumCols() { return this.numCols; }
    public int getNumConsecToWin(){ return this.numConsecToWin; }

    /*
    changes whos turn it is
     */
    public void changeTurn(){
        char temp = this.turn;
        this.turn = this.notTurn;
        this.notTurn = temp;
    }

    /*
    sets a piece on the game board
     */
    public void setPiece(int row, int col, GamePiece piece){
        this.board.setPiece(row, col, piece);
    }

    /*
    gets the max score for one symbol on the board
     */
    public int getScore(char symbol){
        return this.board.getMaxConsec(symbol);
    }

    /*
    checks if a user's score is equal to what is needed to win
     */
    public boolean isWinner(char symbol){
        if(this.getNumConsecToWin() <= this.getScore(symbol)){ return true; }
        return false;
    }

    /*
    determines if there are no more board spaces or if there is a winner
     */
    public boolean isEnd(){
        if(this.isWinner(this.getTurn()) || this.isWinner(this.getNotTurn()) || !this.board.hasEmptySpace()){ return true; }
        return false;
    }

    /*
    prints out a statement about the current game status
     */
    public String getStatus(){
        if(!this.isEnd()){
            return "Player " + this.getTurn() + "'s turn";
        }
        else if(this.isWinner(this.getTurn())){
            return "Player " + this.getTurn() + " wins!";
        }
        else if(this.isWinner(this.getNotTurn())){
            return "Player " + this.getNotTurn() + " wins!";
        }
        else if(this.isEnd() && !this.isWinner(this.getTurn()) && !this.isWinner(this.getNotTurn())){
            return "It's a tie";
        }
        return "Something went wrong. Oops.";
    }
}
