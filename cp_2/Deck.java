package cisc181.cp_2;

import java.util.ArrayList;

public class Deck{
    /*
    the deck of card a user could draw from on their turn,
    allowing them to move and granting random attributes
     */
    private ArrayList<Integer> deck;

    public Deck(){
        deck = new ArrayList<Integer>();
        int i = 0;
        while(i < 10){
            deck.add(i);
            i++;
        }
    }

    public ArrayList<Integer> getDeck() { return this.deck; }
}
