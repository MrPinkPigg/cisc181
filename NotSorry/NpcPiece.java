package cisc181.NotSorry;

public class NpcPiece extends GamePiece {
	private int special;

    public NpcPiece(char symbol){
    	super(symbol);
    	this.special = Math.rand(2);
    }

    public char getNpcPiece(){ return this.getSymbol(); }
    public int getSpecial(){ return this.special(); }
}
