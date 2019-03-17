package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

public class Fruit {
    private String type;
    private String color;

    /*
    default constructor for Fruit
    */
    public Fruit(String type, String color){
        this.type = type;
        this.color = color;
    }

    /*
    returns a fruit's color
    */
    public String getColor() { return color; }
    /*
    returns a fruit's type
    */
    public String getFruitType() { return type; }

    /*
    overrides toString to give info about the fruit
    */
    @Override
    public String toString() {
        return this.color + " " + this.type;
    }
}
