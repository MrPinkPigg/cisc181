package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

public class Monkey extends Pet{

    /*
    default constructor for a monkey
    */
    public Monkey(String name, String furColor, int age){
        super(name, furColor, age);
    }

    /*
    prints "banana"
    */
    public void eat(){
        System.out.println("banana");
    }

    /*
    prints "eeh eeh"
    */
    public void speak(){
        System.out.println("eeh eeh");
    }

    /*
    runs climbUp and climbDown and prints "swing from trees"
    */
    public void play() {
        climbUp();
        System.out.println("swing from trees");
        climbDown();
    }
    /*
    prints "in tree"
    */
    public void climbUp(){
        System.out.println("In Tree");
    }
    /*
    prints "on ground"
    */
    public void climbDown(){
        System.out.println("On Ground");
    }

    /*
    overrides totring to include "Monkey named ..."
    */
    @Override
    public String toString() {
        return "Monkey named " + super.toString();
    }
}
