package cisc181.Lab_5;

import java.util.ArrayList;

public class Grocer {
    private ArrayList<Edible> items;

    public Grocer() {
        items = new ArrayList<Edible>();
    }

    public void addEdibleItem(Edible edibleItem) {
        items.add(edibleItem);
    }

    public String getEdibleList() {
        StringBuffer buffer = new StringBuffer();
        for (Edible ed : items) {
            buffer.append(ed.toString());
            buffer.append('\n');
        }
        return buffer.toString();
    }


}
