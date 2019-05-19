/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package com.example.notsorry;

import java.util.ArrayList;
import java.util.Collections;

/*
The Deck class that handles the "deck" of cards
    (its just a random number generator lol)
Parameters:
    ArrayList<Integer> deck - the deck of cards
 */

public class Deck{

    private ArrayList<Integer> deck;

    /*
    default constructor for a Deck
     */
    public Deck(){
        deck = new ArrayList<Integer>();
        int i = 1;
        while(i < 9){
            deck.add(i);
            i++;
        }
    }

    /*
    getters
     */
    public ArrayList<Integer> getDeck() { return this.deck; }

    /*
    draws a card from the deck
    Returns:
        int - the drawn card's value
     */
    public int drawCard(){
        Collections.shuffle(this.deck);
        int output = this.deck.get(0);
        System.out.println("You drew a " + output);
        return output;
    }
}
