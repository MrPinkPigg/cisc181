package cisc181.cp_2;

import java.util.ArrayList;

public class xxxGame extends Game {
    private int turn;
    private int notTurn;
    private Deck deck;
    private PlayerPiece p1_1;
    private PlayerPiece p1_2;
    private PlayerPiece p2_1;
    private PlayerPiece p2_2;
    private NpcPiece npc1;
    private NpcPiece npc2;
    private int p1Score;
    private int p2Score;
    private GameBoard board;

    public xxxGame(){
        this.board = new GameBoard(setUpStartingBoard());

        this.deck = new Deck();
        this.p1Score = 0;
        this.p2Score = 0;

        this.p1_1 = new PlayerPiece('X', false, 1, 4);
        this.p1_2 = new PlayerPiece('X', true, 1, 5);
        this.p2_1 = new PlayerPiece('O', false, 6, 2);
        this.p2_2 = new PlayerPiece('O', true, 6, 3);

        this.npc1 = new NpcPiece('B', 0, 0);
        this.npc2 = new NpcPiece('G', 7, 7);

        this.turn = 1;
        this.notTurn = 2;
    }

    /*
    getters
     */
    public Deck getDeck(){ return this.deck; }
    public int getP1Score(){ return this.p1Score; }
    public int getpP2Score(){ return this.p2Score; }
    public PlayerPiece getP1_1(){ return this.p1_1; }
    public PlayerPiece getP1_2(){ return this.p1_2; }
    public PlayerPiece getP2_1(){ return this.p2_1; }
    public PlayerPiece getP2_2(){ return this.p2_2; }
    public NpcPiece getNpc1(){ return this.npc1; }
    public NpcPiece getNpc2(){ return this.npc2; }
    public int getTurn(){ return this.turn; }
    public int getNotTurn(){ return this.notTurn; }

    /*
    setters
     */
    public void setTurn(int newTurn){ this.turn = newTurn; }
    public void setNotTurn(int notTurn){ this.notTurn = notTurn; }
    public void setP1Score(int score){ this.p1Score = score; }
    public void setP2Score(int score){ this.p2Score = score; }

    public GamePiece[][] setUpStartingBoard(){
        GamePiece[][] startingBoard = new GamePiece[8][8];
        for(int i = 0; i < startingBoard.length; i++){
            for(int k = 0; k < startingBoard[0].length; k++){
                startingBoard[i][k] = new GamePiece('E');
            }
        }
        return startingBoard;
    }

    public void performAction(Action turn){

    }

    public boolean getScore(int player){
        if(player == 1){
            if(this.p1Score == 2){
                return true;
            }
        }
        else if(player == 2){
            if(this.p2Score == 2){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }

    public boolean isEnd() {
        return isWinner(turn) || isWinner(notTurn);
    }

    // Player wins if num consec in a row
    public boolean isWinner(int player) {
        return getScore(player);
    }

    public String getStatus() {
        if (isEnd()) {
            if (isWinner(this.turn)) {
                return "\nPlayer " + this.turn + " wins!\n";
            }
            else if (isWinner(this.notTurn)) {
                return "\nPlayer " + this.notTurn + " wins!\n";
            }
            else{
                return "unga bunga";
            }
        }
        else {
            return "\nPlayer " + this.turn + "'s turn\n";
        }
    }

    @Override
    public String toString() {
        String status =   this.board.toString();
        status += "\n" + getStatus();
        return status;
    }
}
