package cisc181.NotSorry;

public class Deck{
    /*
    the deck of card a user could draw from on their turn,
    allowing them to move and granting random attributes
     */
    private int deck [];

    public Deck(){
        this.deck = new int[11];
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }
    }

    public int[] getDeck() { return this.deck; }
}
