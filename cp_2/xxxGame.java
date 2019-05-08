package cisc181.cp_2;

import java.util.ArrayList;

public class xxxGame extends Game {
    private final NpcPiece npc1 = new NpcPiece('G');
    private final NpcPiece npc2 = new NpcPiece('B');

    private char turn;
    private Deck deck;
    private PlayerPiece p1_1;
    private PlayerPiece p1_2;
    private PlayerPiece p2_1;
    private PlayerPiece p2_2;
    private int p1Score;
    private int p2Score;

    public xxxGame(){
        this.deck = new Deck();
        this.p1Score = 0;
        this.p2Score = 0;

        this.p1_1 = new PlayerPiece('X', false);
        this.p1_2 = new PlayerPiece('X', true);
        this.p2_1 = new PlayerPiece('O', false);
        this.p2_2 = new PlayerPiece('O', true);

        this.turn = '1';
    }


}
