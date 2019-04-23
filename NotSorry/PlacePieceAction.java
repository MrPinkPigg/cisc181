package cisc181.NotSorry;

public class PlacePieceAction implements Action<TicTacToeTypeGame> {
    private int row;
    private int col;
    private char player;

    public PlacePieceAction(char player, int row, int col){
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
        if(game.getTurn() == this.player && game.getGameBoard().isInBounds(this.row, this.col) && game.getGameBoard().getPiece(this.row, this.col).getSymbol() == 'E'){
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
        return "Placed on row " + this.getRow() + " and on column " + this.getCol();
    }
}
