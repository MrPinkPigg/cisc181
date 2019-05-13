package cisc181.cp_2;

public class PlayerAction implements Action<xxxGame> {
    private int piece;
    private int player;

    public PlayerAction(int piece, int player){
        this.piece = piece;
        this.player = player;
    }

    public int getPiece(){ return this.piece; }

    /*
    Checks that the chosen piece is either:
        1 or 2 for the player piece
        3 or 4 for the npc piece
     */
    public boolean isValid(xxxGame game) {
        return this.piece == 1 || this.piece == 2 || this.piece == 3 || this.piece == 4;
    }

    public void update(xxxGame game) {
        if(this.player == 1){
            if(this.piece == 1){
                game.getP1_1().movePiece(game.getDeck().drawCard());
            }
            else if(this.piece == 2){
                game.getP1_2().movePiece(game.getDeck().drawCard());
            }
            else if(this.piece == 3){
                game.getNpc1().movePiece();
            }
            else{
                game.getNpc2().movePiece();
            }
        }
        else{
            if(this.piece == 1){
                game.getP2_1().movePiece(game.getDeck().drawCard());
            }
            else if(this.piece == 2){
                game.getP2_2().movePiece(game.getDeck().drawCard());
            }
            else if(this.piece == 3){
                game.getNpc1().movePiece();
            }
            else{
                game.getNpc2().movePiece();
            }
        }
    }

    public String toString() {
        if(this.piece == 1 || this.piece == 2){
            return "Moved player " + this.player + "'s " + this.piece + " piece.";
        }
        else{
            return "Moved NPC piece " + this.piece;
        }
    }
}
