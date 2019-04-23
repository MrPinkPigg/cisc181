/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.NotSorry;

public class GamePiece {
    public static final char EMPTY = 'E';
    private char symbol;

    /*
    constructor for GamePiece, takes in one char
     */
    public GamePiece(char symbol){
        this.symbol = symbol;
    }

    /*
    accessor for GamePiece
     */
    public char getSymbol() { return this.symbol; }

    /*
    determines if a game piece is set to EMPTY
     */
    public boolean isEmpty(){
        if(this.getSymbol() == EMPTY){ return true; }
        else { return false; }
    }

    /*
    override for toString
     */
    @Override
    public String toString() {
        return Character.toString(this.getSymbol());
    }

    /*
    override for equals
    */
    //@Override
    public boolean equals(GamePiece other) {
        if(other.getSymbol() == this.getSymbol()){ return true; }
        else { return false; }
    }
}
