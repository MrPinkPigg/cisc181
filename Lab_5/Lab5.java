package cisc181.Lab_5;

public class Lab5 {
    public static void main(String args[]){
        Grocer grocery = new Grocer();
        grocery.addEdibleItem(new StrawberryShortcake());
        grocery.addEdibleItem(new Blueberry(45));
        grocery.addEdibleItem(new Cranberry(40));
        System.out.println(grocery.getEdibleList());
    }
}
