package cisc181.Lab_5;

public class StrawberryShortcake implements Edible {
    /*
    override for getCalories()
     */
    public double getCalories(){
        return 300;
    }

    /*
    toString override
     */

    @Override
    public String toString() {
        return "Strawberry Shortcake";
    }
}
