package cisc181.Lab_3;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

public class Dog {
    private String name;
    private String color;

    /*
    constructs a dog with default parameters
    */
    public Dog(){
        name = "Spot";
        color = "brown";
    }

    /*
    constructs a dog with user input parameters
     */
    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    //returns a dog name
    public String getName() { return this.name; }

    //returns a dog color
    public String getFurColor() { return this.color; }

    //returns "woof" when called
    public String bark() { return "woof"; }

    //returns "zzz" when called
    public String sleep() { return "zzz"; }

    //returns "wagging tail when called
    public String wagTail() { return "wagging tail"; }

    /*
    main method, generates a dog and outputs some strings
     */
    public static void main(String args[]){
        Dog Rover = new Dog("Rover", "white");
        System.out.println(Rover.bark());
        System.out.println(Rover.sleep());
        System.out.println(Rover.wagTail());

        System.out.println(Rover.toString());
    }

    /*
    Override of toString method
     */
    public String toString(){
        return name + " with " + color + " fur";
    }
}
