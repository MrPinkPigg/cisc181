/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package cisc181.cp_2;

/*
The main game class
Set parameters:
    int turn - a 1 or 2, depending on who's turn it is
    int notTurn - a 1 or 2, depending on who's turn it isn't
    Deck deck - the deck of cards, from 1-8, of a Deck type
    PlayerPiece p1_1 - p1's first piece
    PlayerPiece p1_2 - p1's second piece
    PlayerPiece p2_1 - p2's first piece
    PlayerPiece p2_2 - p2's second piece
    NpcPiece npc1 - the first ('B') npc piece
    NpcPiece npc2 - the second ('G') npc piece
    int p1Score - the numeric score of player 1
    int p2Score - the numeric score of player 2
    GameBoard board - the gameboard, which stores all the pieces
 */

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

    /*
    default constructor for xxxGame, sets up the board, and sets all the initial pieces and turns
     */
    public xxxGame(){
        this.board = new GameBoard(setUpStartingBoard());

        this.deck = new Deck();
        this.p1Score = 0;
        this.p2Score = 0;

        this.p1_1 = new PlayerPiece('X', 1, 4);
        this.p1_2 = new PlayerPiece('X', 1, 5);
        this.p2_1 = new PlayerPiece('O', 6, 2);
        this.p2_2 = new PlayerPiece('O', 6, 3);

        this.npc1 = new NpcPiece('B', 1, 0, 0);
        this.npc2 = new NpcPiece('G', 2, 7, 7);

        this.turn = 1;
        this.notTurn = 2;

        board.setPiece(p1_1.getRow(), p1_1.getCol(), p1_1);
        board.setPiece(p1_2.getRow(), p1_2.getCol(), p1_2);
        board.setPiece(p2_1.getRow(), p2_1.getCol(), p2_1);
        board.setPiece(p2_2.getRow(), p2_2.getCol(), p2_2);

        board.setPiece(npc1.getRow(), npc1.getCol(), npc1);
        board.setPiece(npc2.getRow(), npc2.getCol(), npc2);
    }

    /*
    getters
     */
    public Deck getDeck(){ return this.deck; }
    public int getP1Score(){ return this.p1Score; }
    public int getP2Score(){ return this.p2Score; }
    public PlayerPiece getP1_1(){ return this.p1_1; }
    public PlayerPiece getP1_2(){ return this.p1_2; }
    public PlayerPiece getP2_1(){ return this.p2_1; }
    public PlayerPiece getP2_2(){ return this.p2_2; }
    public NpcPiece getNpc1(){ return this.npc1; }
    public NpcPiece getNpc2(){ return this.npc2; }
    public int getTurn(){ return this.turn; }
    public int getNotTurn(){ return this.notTurn; }
    public GameBoard getBoard() { return this.board; }

    /*
    setters
     */
    public void setTurn(int newTurn){ this.turn = newTurn; }
    public void setNotTurn(int notTurn){ this.notTurn = notTurn; }
    public void setP1Score(int score){ this.p1Score = score; }
    public void setP2Score(int score){ this.p2Score = score; }

    /*
    sets up a starting 8x8 board with all starting spaces being '~'
    Returns:
        GamePiece[][] - a 2d array of GamePieces
     */
    public GamePiece[][] setUpStartingBoard(){
        GamePiece[][] startingBoard = new GamePiece[8][8];
        for(int i = 0; i < startingBoard.length; i++){
            for(int k = 0; k < startingBoard[0].length; k++){
                startingBoard[i][k] = new GamePiece('~');
            }
        }
        return addStartingPieces(startingBoard);
    }

    /*
    adds all the starting pieces to the board, and removes the '~' from the middle
    where no pieces can go
    Parameters:
        GamePiece[][] startingBoard - the 2d array defined in setUpStartingBoard()
    Returns:
        GamePiece[][] - a 2d array of GamePieces
     */
    public GamePiece[][] addStartingPieces(GamePiece[][] startingBoard){
        for(int i = 1; i < 7; i++){
            for(int k = 1; k < 7; k++){
                startingBoard[i][k] = new GamePiece(' ');
            }
        }

        startingBoard[1][2] = new GamePiece('~');
        startingBoard[2][2] = new GamePiece('~');
        startingBoard[5][5] = new GamePiece('~');
        startingBoard[6][5] = new GamePiece('~');

        return startingBoard;
    }

    /*
    Updates the turns, swaping this.turn and this.notTurn
     */
    public void updateTurns(){
        int temp = this.turn;
        this.setTurn(this.notTurn);
        this.setNotTurn(temp);
    }

    /*
    checks the scoring of the players. If a piece is identified to be in the
    "score" spot of the home row, the player gets a point and the piece is moved off of the board
    Parameters:
        int player - the current player, who to check the scoring of
     */
    public void checkScoring(int player){
        if(player == 1){
            if(this.getP1_1().getRow() == 2 && this.getP1_1().getCol() == 2){
                this.setP1Score(this.p1Score + 1);
                this.getP1_1().setRow(3);
                this.getP1_1().setCol(3);
                this.getBoard().setPiece(getP1_1().getRow(), getP1_1().getCol(), getP1_1());
                this.getBoard().setPiece(2, 2, new GamePiece('~'));
                System.out.println("P1 score: " + this.getP1Score());
            }
            else if(this.getP1_2().getRow() == 5 && this.getP1_2().getCol() == 5){
                this.setP1Score(this.p1Score + 1);
                this.getP1_2().setRow(3);
                this.getP1_2().setCol(4);
                this.getBoard().setPiece(getP1_2().getRow(), getP1_2().getCol(), getP1_2());
                this.getBoard().setPiece(2, 2, new GamePiece('~'));
                System.out.println("P1 score: " + this.getP1Score());
            }
        }
        else{
            if(this.getP2_1().getRow() == 5 && this.getP2_1().getCol() == 5){
                this.setP1Score(this.p2Score + 1);
                this.getP2_1().setRow(4);
                this.getP2_1().setCol(3);
                this.getBoard().setPiece(getP2_1().getRow(), getP2_1().getCol(), getP2_1());
                this.getBoard().setPiece(5, 5, new GamePiece('~'));
                System.out.println("P2 score: " + this.getP2Score());
            }
            else if(this.getP2_2().getRow() == 5 && this.getP2_2().getCol() == 5){
                this.setP1Score(this.p2Score + 1);
                this.getP2_2().setRow(4);
                this.getP2_2().setCol(4);
                this.getBoard().setPiece(getP2_2().getRow(), getP2_2().getCol(), getP2_2());
                this.getBoard().setPiece(5, 5, new GamePiece('~'));
                System.out.println("P2 score: " + this.getP2Score());
            }
        }
    }

    /*
    updates the game based on an input turn
    Parameters:
        Action turn - the Action performed by a player on their turn
     */
    public void performAction(Action turn){
        turn.update(this);
    }

    /*
    checks if the game should be over based on isWinner()
    Returns:
        boolean - if the game should be over
     */
    public boolean isEnd() {
        return isWinner(turn) || isWinner(notTurn);
    }

    /*
    checks if there is a winner based on if player's score is >=2
    Parameters:
        int player - the player score to check
    Returns:
        boolean - if the player won
     */
    public boolean isWinner(int player) {
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

    /*
    Gets the status of the game, like who's turn it is, and what the scores are
    Returns:
        String - the status of the game
     */
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
            return "\nPlayer " + this.turn + "'s turn\nPlayer 1 has " + this.getP1Score() + " points, and\nPlayer 2 has " + this.getP2Score() + " points.\n";
        }
    }

    /*
    Overrides toString, to print the board and the game status
    Returns:
        String - the string combination of te board and game status
     */
    @Override
    public String toString() {
        String status =   this.board.toString();
        status += "\n" + getStatus();
        return status;
    }
}
