/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_6;

public class GameBoard {
    GamePiece board[][];

    /*
    constructor for GameBoard
     */
    public GameBoard(GamePiece board [][]){
        this.board = board;
    }

    /*
    gets a board
     */
    public GamePiece[][] getBoard() { return this.board; }

    /*
    gets a specific GamePiece from the board
     */
    public GamePiece getPiece(int row, int col) { return this.board[row][col]; }

    /*
    sets a piece on the board
     */
    public void setPiece(int row, int col, GamePiece newPiece){ this.board[row][col] = newPiece; }

    /*
    checks if there is any empty space on the board
     */
    public boolean hasEmptySpace(){
        for(int i = 0; i < this.board.length; i++){
            for(int k = 0; k < this.board[0].length; k++){
                if(getPiece(i, k).isEmpty()){
                    return true;
                }
            }
        }
        return false;
    }

    /*
    takes bounds for the gameboard and checks that they are viable
     */
    public boolean isInBounds(int row, int col){
        if(this.board.length > row && this.board[0].length > col){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    prints out the current game board
     */
    public void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int k = 0; k < board[0].length; k++){
                System.out.print(getPiece(i, k));
            }
            System.out.println();
        }
    }

    /*
    takes in a start row and column, and determines how many of
    a consecutive character show up in that row/col
     */
    public int numConsec(int startRow, int startCol, int deltaRow, int deltaCol, char symbol){
        int curRow = startRow;
        int curCol = startCol;
        int consec = 0;
        int temp = 0;

        if(deltaRow == 0){
            while(curCol < this.board[0].length){
                if(getPiece(curRow, curCol).getSymbol() == symbol){
                    temp++;
                    if(temp > consec) {
                        consec = temp;
                    }
                }
                else{
                    consec = temp;
                    temp = 0;
                }
                curCol += deltaCol;
            }
        }
        else if(deltaCol == 0){
            while(curRow < this.board[0].length){
                if(getPiece(curRow, curCol).getSymbol() == symbol){
                    temp++;
                    if(temp > consec) {
                        consec = temp;
                    }
                }
                else{
                     consec = temp;
                     temp = 0;
                }
                curRow += deltaRow;
            }
        }
        else{
            while(curCol < this.board.length && curRow < this.board[0].length){
                if(getPiece(curRow, curCol).getSymbol() == symbol){
                    temp++;
                    if(temp > consec) {
                        consec = temp;
                    }
                }
                else{
                     consec = temp;
                     temp = 0;
                }
                curCol += deltaCol;
                curRow += deltaRow;
            }
        }
        return consec;
    }

    /*
    checks every row and column on the board for consecutive characters
     */
    public int getMaxConsec(char symbol){
        int consec = 0;
        int temp = 0;

        for(int i = 0; i < this.board[0].length; i++){
            temp = this.numConsec(i, 0, 0, 1, symbol);
            if(consec < temp){ consec = temp; }
        }

        for(int k = 0; k < this.board.length; k++){
            temp = this.numConsec(0, k, 1, 0, symbol);
            if(consec < temp){ consec = temp; }
        }

        temp = this.numConsec(0, 0, 1, 1, symbol);
        if(consec < temp){ consec = temp; }

        temp = this.numConsec(0, this.board[0].length, -1, -1, symbol);
        if(consec < temp){ consec = temp; }

        return consec;
    }
}
