package cisc181.cp_2;

public class PlayerPiece extends GamePiece {
	private boolean special;

    public PlayerPiece(char symbol, boolean special){
        super(symbol);
        this.special = special;
    }

    public char getPlayerSymbol() { return this.getSymbol(); }
    public boolean getSpecial() { return this.special; }
}
