/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package cisc181.cp_2;

/*
The class for handling the NPC Pieces, and movement
Parameters:
    int special - whether the piece is the bad (1) or good (2) npc
    int row - the current row of the piece
    int col - the current column of the piece
 */

public class NpcPiece extends GamePiece{
	private int special;
	private int row;
	private int col;

	/*
	the default constructor for a NpcPiece
	Parameters:
	    char svmbol - the symbol representing the piece on the board
	    int row - the current row of the piece on the board
	    int col - the current column of the piece on the board
	 */
    public NpcPiece(char symbol, int special, int row, int col){
    	super(symbol);
    	this.special = special;

    	this.row = row;
    	this.col = col;
    }

    /*
    getters
     */
    public char getNpcPiece(){ return this.getSymbol(); }
    public int getSpecial(){ return this.special; }
    public int getRow(){ return this.row; }
    public int getCol(){ return this.col; }

    /*
    setters
     */
    public void setRow(int newRow){ this.row = newRow; }
    public void setCol(int newCol){ this.col = newCol; }

    /*
    handles movement of the npc pieces. Movement is based on a d6,
    going counter-clockwise
     */
    public void movePiece(){
        int rand = (int)(Math.random()*6) + 1;
        System.out.println("You rolled a " + rand);

        while(rand > 0){
            if ( this.getRow() < 7 && this.getCol() == 0 )
                this.setRow(this.getRow() + 1);
            else if ( this.getRow() == 7 && this.getCol() < 7 )
                this.setCol(this.getCol() + 1);
            else if ( this.getRow() > 0 && this.getCol() == 7 )
                this.setRow(this.getRow() - 1);
            else if ( this.getRow() == 0 && this.getCol() > 0 )
                this.setCol(this.getCol() - 1);

            rand--;
        }
    }
}
