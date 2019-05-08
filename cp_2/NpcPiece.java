package cisc181.cp_2;

public class NpcPiece extends GamePiece {
	private int special;

    public NpcPiece(char symbol){
    	super(symbol);
    	this.special = (int)Math.random();
    }

    public char getNpcPiece(){ return this.getSymbol(); }
    public int getSpecial(){ return this.special; }
}
