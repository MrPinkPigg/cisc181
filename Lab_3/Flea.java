package cisc181.Lab_3;

public class Flea{
    private DogWithFlea owner;

    public Flea(DogWithFlea dog){
        owner = dog;
    }

    public void biteOwner(){ owner.setNewFleaBite(true); }
}
