/**
 * Aaron Knestaut
 * Dylan Kirk
 *
 * Cisc181
 */

package com.example.notsorry;

import java.util.Scanner;

/*
the UI class for xxxGame, that takes user input and generally handles running the game
Parameters:
    xxxGame game - the game to be played and get input for
 */

public class xxxUI implements UserInput<xxxGame>{
    private xxxGame game;

    /*
    default constructor for xxxUI, that creates a new xxxGame
     */
    public xxxUI(){
        game = new xxxGame();
    }

    /*
    getters
     */
    public xxxGame getGame(){
        return game;
    }

    /*
    gets the user's next move, and returns that move if valid
    Parameters:
        xxxGame game - the game to get a move for
    Returns:
        PlayerAction - returns the player's valid action
     */
    public PlayerAction getUserNextMove(xxxGame game){
        Scanner scr = new Scanner(System.in);
        boolean validMove = false;
        PlayerAction move = null;
        int piece;
        int card = game.getDeck().drawCard();

        while (!validMove){
            // Get the user input for the next move
            System.out.println("Choose which piece or NPC piece you want to move: \n(1, 2, 3, or 4)");
            piece = scr.nextInt();

            // Create an instance of the corresponding action
            move = new PlayerAction(piece, game.getTurn(), card);
            // check if its a valid move
            validMove = move.isValid(game);
            if(!validMove){
                System.out.println("Invalid Move - try again");
            }
        }

        // return the move
        return move;
    }

    /*
    the main function, runs the game
     */
    public static void main(String args[]){

        xxxUI ns = new xxxUI();
        PlayerAction turn;

        //while the game hasn't ended:
        while (!ns.getGame().isEnd()){

            // print status of game
            System.out.println(ns.getGame());

            // get the next move from the current player
            turn = ns.getUserNextMove(ns.getGame());

            // print the next move
            System.out.println(turn);

            // perform the next move
            ns.getGame().performAction(turn);

            //update scores
            ns.getGame().checkScoring(ns.getGame().getTurn());

            //update turns
            ns.getGame().updateTurns();
        }
        System.out.println(ns.getGame());
    }
}
