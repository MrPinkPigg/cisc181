package cisc181.Lab_5;

public class Blueberry extends Berry implements Edible {
    /*
    constructor for Blueberry
     */
    public Blueberry(double grams){
        super("blue", grams);
    }

    /*
    override for harvestBerry()
     */
    public String harvestBerry(){
        return "Picking";
    }

    /*
    override for getCalories()
     */
    public double getCalories(){
        return .57 * this.getGrams();
    }

    /*t
    toString override
     */
    @Override
    public String toString() {
        return "Blueberry";
    }
}
