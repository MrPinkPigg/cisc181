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
        flea = new Flea(this);
    }

    public DogWithFlea(String name, String color){
        super(name, color);
        newFleaBite = false;
        flea = new Flea(this);
    }

    //returns a dog's flea object
    public Flea getFlea() { return this.flea;}

    //returns the value of newFleaBite
    public boolean hasNewFleaBite() { return this.newFleaBite; }

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

    @Override
    public String wagTail() {
        if(!this.newFleaBite) {
            return super.wagTail();
        }
        else{
            return scratch() + " " + super.wagTail();
        }
    }

    @Override
    public String sleep() {
        if(!this.newFleaBite) {
            return super.sleep();
        }
        else{
            return scratch() + " " + super.sleep();
        }
    }

    public String scratch(){
        if(this.newFleaBite){
            this.setNewFleaBite(false);
            return "scratching";
        }
        else{
            return "";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "and a flea";
    }
}
