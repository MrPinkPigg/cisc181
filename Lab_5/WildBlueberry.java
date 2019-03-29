package cisc181.Lab_5;

public class WildBlueberry  extends Blueberry{
    /*
    constructor for a WildBlueberry
     */
    public WildBlueberry(double grams){
        super(grams);
    }

    /*
    Override for Blueberry getCalories()
     */
    public double getCalories(){
        return .35 * this.getGrams();
    }

    /*
    toString override
     */

    @Override
    public String toString() {
        return "Wild Blueberry";
    }
}
