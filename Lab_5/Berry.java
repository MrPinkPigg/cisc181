package cisc181.Lab_5;

abstract class Berry {
    private String color;
    private double grams;

    /*
    constructor for Berry
     */
    public Berry(String color, double grams){
        this.color = color;
        this.grams = grams;
    }

    /*
    gets a Berry color
     */
    public String getColor(){ return this.color; }

    /*
    gets a Berry grams
     */
    public double getGrams(){ return this.grams; }

    /*
    returns how a type of Berry is picked
     */
    abstract String harvestBerry();

    /*
    overrides the equals method to see if two berries are equal
     */
    //@Override
    public boolean equals(Berry otherBerry) {
        if(this.color.equals(otherBerry.getColor()) && this.grams == otherBerry.getGrams())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Berry";
    }
}
