package cisc181.cp_2;

public class NpcPiece extends GamePiece{
	private int special;
	private int row;
	private int col;

    public NpcPiece(char symbol, int row, int col){
    	super(symbol);
    	this.special = (int)Math.random();

    	this.row = row;
    	this.col = col;
    }

    public char getNpcPiece(){ return this.getSymbol(); }
    public int getSpecial(){ return this.special; }

    public int rollMove(){ return (int)(Math.random()*6) + 1; }

    public void movePiece(){

    }
}
