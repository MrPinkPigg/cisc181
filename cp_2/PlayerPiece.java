/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package cisc181.cp_2;

/*
the class for handling the player's pieces, and movement
Parameters:
    int row - a PlayerPiece's current row
    int col - a PlayerPiece's current column
 */

public class PlayerPiece extends GamePiece {
    private int row;
    private int col;

    /*
    default constructor for a PlayerPiece
    Parameters:
        char symbol - the player's piece symbol
        int row - the piece's current row
        int col - the piece's current column
     */
    public PlayerPiece(char symbol, int row, int col) {
        super(symbol);
        this.row = row;
        this.col = col;
    }

    /*
    getters
     */
    public char getPlayerSymbol() { return this.getSymbol(); }
    public int getRow() { return this.row; }
    public int getCol() { return this.col; }

    /*
    setters
    */
    public void setRow(int row){ this.row = row; }
    public void setCol(int col){ this.col = col; }

    /*
    Handles moving a PlayerPiece around the board, based on a drawn
    card, going clockwise
    Parameters:
        int movement - the amount a piece will move, based on a drawn card
     */
    public void movePiece(int movement) {
        int oldRow = this.row;
        int oldCol = this.col;

        /*
        checks if the piece you want to move is still in your starting zone, and will
        move it properly if you draw a 1 or 2
         */
        if(this.row == 1 && this.col == 4 || this.row == 1 && this.col == 5){
            if(movement == 1){
                this.setRow(0);
                this.setCol(5);
            }
            else if(movement == 2){
                this.setRow(0);
                this.setCol(6);
            }
        }
        else if(this.row == 6 && this.col == 2 || this.row == 6 && this.col == 3){
            if(movement == 1){
                this.setRow(7);
                this.setCol(2);
            }
            else if(movement == 2){
                this.setRow(7);
                this.setCol(1);
            }
        }
        /*
        if the piece is outside of the start, the movement loops until
        at 0, while updating where the piece should be on the board
         */
        else{
            while(movement > 0){
                /*
                an exception is made for when at the base of the home row, where the piece
                needs to move into the home row as opposed to continuing around the board
                */
                if(this.getPlayerSymbol() == 'X' && this.getRow() == 0 && this.getCol() == 2)
                    this.setRow(1);
                else if(this.getPlayerSymbol() == 'O' && this.getRow() == 7 && this.getCol() == 5)
                    this.setRow(6);
                else if(this.getRow() == 1 && this.getCol() == 2)
                    this.setRow(2);
                else if(this.getRow() == 6 && this.getCol() == 5)
                    this.setRow(5);
                //Below is the loop that moves a piece normally around the board
                else if ( this.getRow() > 0 && this.getCol() == 0 )
                    this.setRow(this.getRow() - 1);
                else if ( this.getRow() == 7 && this.getCol() > 0 )
                    this.setCol(this.getCol() - 1);
                else if ( this.getRow() < 7 && this.getCol() == 7 )
                    this.setRow(this.getRow() + 1);
                else if ( this.getRow() == 0 && this.getCol() < 7 )
                    this.setCol(this.getCol() + 1);

                movement--;
            }
        }


    }
}
