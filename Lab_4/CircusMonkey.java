package cisc181.Lab_4;

/**
 *	Aaron Knestaut
 *	Cisc 181-012
*/

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class CircusMonkey extends Monkey {
    private Fruit snack;

    /*
	default constructor for CircusMonkey
    */
    public CircusMonkey(String name, String color, int age){
        super(name, color, age);
        this.snack = new Fruit("banana", "yellow");
    }

    /*
	constructor for CircusMonkey that specifies a snack
    */
    public CircusMonkey(String name, String color, int age, String fruitType, String fruitColor){
        super(name, color, age);
        this.snack = new Fruit(fruitType, fruitColor);
    }

    /*
	returns the CircusMonkey's snack
    */
    public Fruit getSnack() { return snack; }

    /*
	sets a new CircusMonkey snack
    */
    public void setSnack(Fruit snack) { this.snack = snack; }

    /*
	overrides toString to output info about the snack
    */
    @Override
    public String toString() {
        return super.toString() + " and a " + this.snack.toString();
    }

    /*
	CircusMonkey gets snack set to null, returns the snack
    */
    public Fruit throwFruit(){
        Fruit temp = this.snack;
        this.setSnack(null);
        return temp;
    }

    /*
	monkey takes in a new snack, if they don't have one
    */
    public boolean catchFruit(Fruit newSnack){
        if(this.snack == null){
            this.setSnack(newSnack);
            return true;
        }
        else{
            return false;
        }
    }

    /*
	takes two monkeys and if they are friends, they try to throw snack to each other
    */
    public static boolean playCatch(CircusMonkey monk1, CircusMonkey monk2){
        if(monk1.getFriend() != monk2 || monk2.getFriend() != monk1){
            return false;
        }
        else if(monk1.snack == null || monk2.snack == null){
            return false;
        }
        else{
            Fruit temp = monk2.throwFruit();
            monk2.catchFruit(monk1.throwFruit());
            monk1.catchFruit(temp);
            return true;
        }
    }
}
