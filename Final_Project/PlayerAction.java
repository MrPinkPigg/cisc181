/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package com.example.notsorry;

/*
The class that handles the player's action, and what to
interface with based on the user input
Parameters:
    int piece - the piece to influence, entered by the user
    int player - the player that made the action
 */

public class PlayerAction implements Action<xxxGame> {
    private int piece;
    private int player;
    private int card;

    /*
    default constructor for a PlayerAction
    Parameters:
        int piece - the piece to apply the action to
        int player - which player is making the action
     */
    public PlayerAction(int piece, int player, int card){
        this.piece = piece;
        this.player = player;
        this.card = card;
    }

    /*
    getters
     */
    public int getPiece(){ return this.piece; }

    /*
    Checks that the chosen piece is either:
        1 or 2 for either player piece
        3 or 4 for either npc piece
    Parameters:
        xxxGame game - the game to check the piece against
    Returns:
        boolean - whether a move was valid
     */
    public boolean isValid(xxxGame game) {
        return this.piece == 1 || this.piece == 2 || this.piece == 3 || this.piece == 4;
    }

    /*
    updates the game based on a valid action
    Parameters:
        xxxGame game - the game to apply the action to
     */
    public void update(xxxGame game) {
        //for some reason i had to define this idk
        int oldRow = 0;
        int oldCol = 0;
        GamePiece oldGamePiece = new GamePiece('~');

        /*
        sets oldRow and oldCol of the game piece, to switch to '~' chars at the end of the action
         */
        if(this.player == 1){
            if(this.piece == 1){
                oldRow = game.getP1_1().getRow();
                oldCol = game.getP1_1().getCol();
                if(oldRow == game.getP1_2().getRow() && oldCol == game.getP1_2().getCol()){
                    oldGamePiece = new GamePiece('x');
                }
                else if(oldRow == game.getP2_1().getRow() && oldCol == game.getP2_1().getCol()){
                    oldGamePiece = new GamePiece('O');
                }
                else if(oldRow == game.getP2_2().getRow() && oldCol == game.getP2_2().getCol()){
                    oldGamePiece = new GamePiece('o');
                }
                else{
                    oldGamePiece = new GamePiece('~');
                }
            }
            else if(this.piece == 2){
                oldRow = game.getP1_2().getRow();
                oldCol = game.getP1_2().getCol();
                if(oldRow == game.getP1_1().getRow() && oldCol == game.getP1_1().getCol()){
                    oldGamePiece = new GamePiece('X');
                }
                else if(oldRow == game.getP2_1().getRow() && oldCol == game.getP2_1().getCol()){
                    oldGamePiece = new GamePiece('O');
                }
                else if(oldRow == game.getP2_2().getRow() && oldCol == game.getP2_2().getCol()){
                    oldGamePiece = new GamePiece('o');
                }
                else{
                    oldGamePiece = new GamePiece('~');
                }
            }
            else if(this.piece == 3){
                oldRow = game.getNpc1().getRow();
                oldCol = game.getNpc1().getCol();
            }
            else{
                oldRow = game.getNpc2().getRow();
                oldCol = game.getNpc2().getCol();
            }
        }
        else{
            if(this.piece == 1){
                oldRow = game.getP2_1().getRow();
                oldCol = game.getP2_1().getCol();
                if(oldRow == game.getP1_1().getRow() && oldCol == game.getP1_1().getCol()){
                    oldGamePiece = new GamePiece('X');
                }
                else if(oldRow == game.getP1_2().getRow() && oldCol == game.getP1_2().getCol()){
                    oldGamePiece = new GamePiece('x');
                }
                else if(oldRow == game.getP2_2().getRow() && oldCol == game.getP2_2().getCol()){
                    oldGamePiece = new GamePiece('o');
                }
                else{
                    oldGamePiece = new GamePiece('~');
                }
            }
            else if(this.piece == 2){
                oldRow = game.getP2_2().getRow();
                oldCol = game.getP2_2().getCol();
                if(oldRow == game.getP1_1().getRow() && oldCol == game.getP1_1().getCol()){
                    oldGamePiece = new GamePiece('X');
                }
                else if(oldRow == game.getP1_2().getRow() && oldCol == game.getP1_2().getCol()){
                    oldGamePiece = new GamePiece('x');
                }
                else if(oldRow == game.getP2_1().getRow() && oldCol == game.getP2_1().getCol()){
                    oldGamePiece = new GamePiece('O');
                }
                else{
                    oldGamePiece = new GamePiece('~');
                }
            }
            else if(this.piece == 3){
                oldRow = game.getNpc1().getRow();
                oldCol = game.getNpc1().getCol();
            }
            else{
                oldRow = game.getNpc2().getRow();
                oldCol = game.getNpc2().getCol();
            }
        }

        /*
        draws a card, prints out what is on the drawn card, and applies that movement
        to the correct GamePiece. If an NPC piece was interacted with, the game will
        roll i die and move the piece based on that
         */
        if(this.player == 1){
            if(this.piece == 1){
                game.getP1_1().movePiece(card);
            }
            else if(this.piece == 2){
                game.getP1_2().movePiece(card);
            }
            else if(this.piece == 3){
                game.getNpc1().movePiece(card);
            }
            else{
                game.getNpc2().movePiece(card);
            }
        }
        else{
            if(this.piece == 1){
                game.getP2_1().movePiece(card);
            }
            else if(this.piece == 2){
                game.getP2_2().movePiece(card);
            }
            else if(this.piece == 3){
                game.getNpc1().movePiece(card);
            }
            else{
                game.getNpc2().movePiece(card);
            }
        }

        /*
        updates the board. sets the old position of the piece to be '~', and updates the
        board to represent the new GamePiece position
         */
        game.getBoard().setPiece(oldRow, oldCol, oldGamePiece);

        if(this.player == 1){
            if(this.piece == 1){
                game.getBoard().setPiece(game.getP1_1().getRow(), game.getP1_1().getCol(), game.getP1_1());
            }
            else if(this.piece == 2){
                game.getBoard().setPiece(game.getP1_2().getRow(), game.getP1_2().getCol(), game.getP1_2());
            }
            else if(this.piece == 3){
                game.getBoard().setPiece(game.getNpc1().getRow(), game.getNpc1().getCol(), game.getNpc1());
                if(game.getNpc1().getRow() == game.getP1_1().getRow() && game.getNpc1().getCol() == game.getP1_1().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(4);
                    game.getBoard().setPiece(game.getP1_1().getRow(), game.getP1_1().getCol(), game.getP1_1());
                }
                else if(game.getNpc1().getRow() == game.getP1_2().getRow() && game.getNpc1().getCol() == game.getP1_2().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(5);
                    game.getBoard().setPiece(game.getP1_2().getRow(), game.getP1_2().getCol(), game.getP1_2());
                }
                else if(game.getNpc1().getRow() == game.getP2_1().getRow() && game.getNpc1().getCol() == game.getP2_1().getCol()){
                    game.getP2_1().setRow(6);
                    game.getP2_1().setCol(2);
                    game.getBoard().setPiece(game.getP2_1().getRow(), game.getP2_1().getCol(), game.getP2_1());
                }
                else if(game.getNpc1().getRow() == game.getP2_2().getRow() && game.getNpc1().getCol() == game.getP2_2().getCol()){
                    game.getP2_2().setRow(6);
                    game.getP2_2().setCol(3);
                    game.getBoard().setPiece(game.getP2_2().getRow(), game.getP2_2().getCol(), game.getP2_2());
                }
            }
            else{
                game.getBoard().setPiece(game.getNpc2().getRow(), game.getNpc2().getCol(), game.getNpc2());
                if(game.getNpc2().getRow() == game.getP1_1().getRow() && game.getNpc2().getCol() == game.getP1_1().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(4);
                    game.getBoard().setPiece(game.getP1_1().getRow(), game.getP1_1().getCol(), game.getP1_1());
                }
                else if(game.getNpc2().getRow() == game.getP1_2().getRow() && game.getNpc2().getCol() == game.getP1_2().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(5);
                    game.getBoard().setPiece(game.getP1_2().getRow(), game.getP1_2().getCol(), game.getP1_2());
                }
                else if(game.getNpc2().getRow() == game.getP2_1().getRow() && game.getNpc2().getCol() == game.getP2_1().getCol()){
                    game.getP2_1().setRow(6);
                    game.getP2_1().setCol(2);
                    game.getBoard().setPiece(game.getP2_1().getRow(), game.getP2_1().getCol(), game.getP2_1());
                }
                else if(game.getNpc2().getRow() == game.getP2_2().getRow() && game.getNpc2().getCol() == game.getP2_2().getCol()){
                    game.getP2_2().setRow(6);
                    game.getP2_2().setCol(3);
                    game.getBoard().setPiece(game.getP2_2().getRow(), game.getP2_2().getCol(), game.getP2_2());
                }
            }
        }
        else{
            if(this.piece == 1){
                game.getBoard().setPiece(game.getP2_1().getRow(), game.getP2_1().getCol(), game.getP2_1());
            }
            else if(this.piece == 2){
                game.getBoard().setPiece(game.getP2_2().getRow(), game.getP2_2().getCol(), game.getP2_2());
            }
            else if(this.piece == 3){
                game.getBoard().setPiece(game.getNpc1().getRow(), game.getNpc1().getCol(), game.getNpc1());
                if(game.getNpc1().getRow() == game.getP1_1().getRow() && game.getNpc1().getCol() == game.getP1_1().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(4);
                    game.getBoard().setPiece(game.getP1_1().getRow(), game.getP1_1().getCol(), game.getP1_1());
                }
                else if(game.getNpc1().getRow() == game.getP1_2().getRow() && game.getNpc1().getCol() == game.getP1_2().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(5);
                    game.getBoard().setPiece(game.getP1_2().getRow(), game.getP1_2().getCol(), game.getP1_2());
                }
                else if(game.getNpc1().getRow() == game.getP2_1().getRow() && game.getNpc1().getCol() == game.getP2_1().getCol()){
                    game.getP2_1().setRow(6);
                    game.getP2_1().setCol(2);
                    game.getBoard().setPiece(game.getP2_1().getRow(), game.getP2_1().getCol(), game.getP2_1());
                }
                else if(game.getNpc1().getRow() == game.getP2_2().getRow() && game.getNpc1().getCol() == game.getP2_2().getCol()){
                    game.getP2_2().setRow(6);
                    game.getP2_2().setCol(3);
                    game.getBoard().setPiece(game.getP2_2().getRow(), game.getP2_2().getCol(), game.getP2_2());
                }
            }
            else{
                game.getBoard().setPiece(game.getNpc2().getRow(), game.getNpc2().getCol(), game.getNpc2());
                if(game.getNpc2().getRow() == game.getP1_1().getRow() && game.getNpc2().getCol() == game.getP1_1().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(4);
                    game.getBoard().setPiece(game.getP1_1().getRow(), game.getP1_1().getCol(), game.getP1_1());
                }
                else if(game.getNpc2().getRow() == game.getP1_2().getRow() && game.getNpc2().getCol() == game.getP1_2().getCol()){
                    game.getP1_1().setRow(1);
                    game.getP1_1().setCol(5);
                    game.getBoard().setPiece(game.getP1_2().getRow(), game.getP1_2().getCol(), game.getP1_2());
                }
                else if(game.getNpc2().getRow() == game.getP2_1().getRow() && game.getNpc2().getCol() == game.getP2_1().getCol()){
                    game.getP2_1().setRow(6);
                    game.getP2_1().setCol(2);
                    game.getBoard().setPiece(game.getP2_1().getRow(), game.getP2_1().getCol(), game.getP2_1());
                }
                else if(game.getNpc2().getRow() == game.getP2_2().getRow() && game.getNpc2().getCol() == game.getP2_2().getCol()){
                    game.getP2_2().setRow(6);
                    game.getP2_2().setCol(3);
                    game.getBoard().setPiece(game.getP2_2().getRow(), game.getP2_2().getCol(), game.getP2_2());
                }
            }
        }


    }

    /*
    Overrides the toString method, to print out what happened because of the action
     */
    public String toString() {
        if(this.piece == 1 || this.piece == 2){
            return "Moved player " + this.player + "'s " + this.piece + " piece.";
        }
        else{
            return "Moved NPC piece " + this.piece;
        }
    }
}
