package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

public class Horse extends Pet{

    /*
    default constructor for horse
    */
    public Horse(String name, String furColor, int age){
        super(name, furColor, age);
    }

    /*
    prints "hay"
    */
    public void eat(){
        System.out.println("hay");
    }

    /*
    prints "neigh"
    */
    public void speak(){
        System.out.println("neigh");
    }

    /*
    runs gallop and jump
    */
    public void play() {
        gallop();
        jump();
        gallop();
    }
    /*
    prints "clippity clop"
    */
    public void gallop(){
        System.out.println("Clippity Clop");
    }
    /*
    prints "jump"
    */
    public void jump() {
        System.out.println("jump");
    }

    /*
    overrides the toString method ton include "Horse named ..."
    */
    @Override
    public String toString() {
        return "Horse named " + super.toString();
    }
}

