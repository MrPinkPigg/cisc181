package cisc181.Lab_5;

public class Winterberry extends Berry {
    /*
    Constructor for a WinterBerry
     */
    public Winterberry(){
        super("red", .117);
    }

    /*
    override for harvestBerry()
     */
    public String harvestBerry(){
        return "Branch Cutting";
    }

    /*
    toString override
     */

    @Override
    public String toString() {
        return "Winterberry";
    }
}
