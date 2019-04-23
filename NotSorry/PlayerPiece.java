package cisc181.NotSorry;

public class PlayerPiece extends GamePiece {
	private int special;

    public PlayerPiece(char symbol){
    	super(symbol);
    	this.special = Math.rand(4);
    }

    public char getPlayerSymbol() { return this.getSymbol(); }
    public int getSpecial() { return this.specail; }
}
