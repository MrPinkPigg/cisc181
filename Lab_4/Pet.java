package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

public abstract class Pet {
    private String name;
    private int age;
    private String furColor;
    private Pet friend;

    /*
    default constructor for a pet
    */
    public Pet(String name, String furColor, int age){
        this.name = name;
        this.age = age;
        this.furColor = furColor;
    }

    /*
    sets a new pet name
    */
    public void setName(String name) {
        this.name = name;
    }
    /*
    sets a new pet age
    */
    public void setAge(int age) {
        this.age = age;
    }
    /*
    sets a new pet furColor
    */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    /*
    sets a new pet friend
    */
    public void setFriend(Pet friend){
        this.friend = friend;
    }

    /*
    returns a pet's name
    */
    public String getName(){
        return name;
    }
    /*
    returns a pet's furColor
    */
    public String getFurColor(){
        return furColor;
    }
    /*
    returns a pet's age
    */
    public int getAge(){
        return age;
    }
    /*
    returns a pet's friend
    */
    public Pet getFriend(){ 
        return friend; 
    }
    /*
    celebrates a pet's birthday
    */
    public void birthday() {
        age++;
        System.out.println("Happy Birthday!" + name);
    }
    /*
    prints "zzz"
    */
    public void sleep(){
        System.out.println("zzz");
    }
    /*
    overrides toString to include info about the pet
    */
    @Override
    public String toString() {
        return this.name + " with " + this.furColor + " fur";
    }
}
