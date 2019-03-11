package cisc181.Lab_3;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

public class DogWithFlea extends Dog {
    private boolean newFleaBite;
    private Flea flea;

    public DogWithFlea(){
        super();
        newFleaBite = false;
        flea = new Flea();
    }

    public DogWithFlea(String name, String color){
        super(name, color);
        newFleaBite = false;
        flea = new Flea();
    }

    //returns a dog's flea object
    public Flea getFlea() { return this.flea;}

    //returns the value of newFleaBite
    public boolean getFleaBite() { return this.newFleaBite; }

    /*
    sets a dog to have a flea bite based on the parameter
     */
    public void setNewFleaBite(boolean bite){
        this.newFleaBite = bite;

        /*
        Reflection
            DogWithFlea is derived from Dog, so it is a Is-a relationship
            DogWithFlea simply uses Flea, so it is a Has-a relationship
         */
    }
}
