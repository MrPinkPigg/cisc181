package cisc181.NotSorry;

public class TossPieceAction implements Action<TicTacToeTypeGame> {
    private int row;
    private int col;
    private char player;

    public TossPieceAction(char player, int row, int col){
        this.player = player;
        this.row = row;
        this.col = col;
    }

    /*
    getters
     */
    public char getPlayer() { return this.player; }
    public int getRow() { return this.row; }
    public int getCol() {return this.col; }

    public boolean isValid(TicTacToeTypeGame game){
        if(game.getTurn() == this.player && game.getGameBoard().isInBounds(this.row, this.col)){
            return true;
        }
        return false;
    }

    public void update(TicTacToeTypeGame game){
        game.setPiece(this.row, this.col, new GamePiece(this.player));
        game.changeTurn();
    }

    @Override
    public String toString() {
        return "Tossed on row " + this.getRow() + " and on column " + this.getCol();
    }
}
