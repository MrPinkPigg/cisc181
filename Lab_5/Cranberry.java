package cisc181.Lab_5;

public class Cranberry extends Berry implements Edible {
    /*
    default constructor for Cranberry
     */
    public Cranberry(double grams){
        super("red", grams);
    }

    /*
    override for harvestBerry()
     */
    public String harvestBerry(){
        return "Wet Harvesting";
    }

    /*
    override for getCalories()
     */
    public double getCalories(){
        return .46 * this.getGrams();
    }

    /*
    toString override
     */

    @Override
    public String toString() {
        return "Cranberry";
    }
}
