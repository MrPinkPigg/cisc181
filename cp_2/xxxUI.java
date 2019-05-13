package cisc181.cp_2;

import java.util.Scanner;

public class xxxUI implements UserInput<xxxGame>{
    private xxxGame game;

    public xxxUI(){
        game = new xxxGame();
    }

    public xxxGame getGame(){
        return game;
    }

    public PlayerAction getUserNextMove(xxxGame game){
        Scanner scr = new Scanner(System.in);
        boolean validMove = false;
        PlayerAction move = null;
        int piece;

        while (!validMove){
            // Get the user input for the next move
            System.out.println("Choose which piece or NPC piece you want to move: ");
            piece = scr.nextInt();

            // Create an instance of the corresponding action
            move = new PlayerAction(piece, game.getTurn());
            // check if its a valid move
            validMove = move.isValid(game);
            if(!validMove){
                System.out.println("Invalid Move - try again");
            }
        }

        // return the move
        return move;
    }

    public static void main(String args[]){

        xxxUI ns = new xxxUI();
        boolean gameEnded = false;
        PlayerAction turn;

        while (!ns.getGame().isEnd()){
            // print status of game
            System.out.println(ns.getGame());
            // get the next move from the user
            turn = ns.getUserNextMove(ns.getGame());
            // print the next move
            System.out.println(turn);
            // perform the next move
            ns.getGame().performAction(turn);
        }
        System.out.println(ns.getGame());
    }
}
