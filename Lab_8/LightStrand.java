package cisc181.Lab_8;


public class LightStrand {

    private int numLights;
    private boolean works;
    private LightStrand next;

    public LightStrand(int numLights, boolean works, LightStrand next) {
        this.numLights = numLights;
        this.works = works;
        this.next = next;
    }

    public boolean getWorks(){
        return this.works;
    }

    public LightStrand getNext(){
        return this.next;
    }

    public int getNumLights(){
        return this.numLights;
    }


    // returns the total number of lights in the linked list
    // uses a loop to traverse the list
    public int totalLights() {

        // set up a current node

        LightStrand current = this;
        // initialize sum
        int sum = 0;

        if (current != null) {
            // traverse lightStrand links
            while (current.getNext() != null) {
                sum += current.getNumLights();
                current = current.getNext();
            }
            sum += current.getNumLights();
        }
        return sum;
    }

    // returns the total number of lights in the linked list
    // using recursion

    public int totalLights(LightStrand current){
        // base case - when there are no more LightStrands in the list
        if (current == null){
            return 0;
        }
        else{
            // add the number of lights from the current LightStrand
            // to the number of lights from the rest of the list
            return current.getNumLights() + totalLights(current.getNext());
        }
    }

    // returns true if all LightStrands in the list have works = true
    // uses a loop to traverse the list
    public boolean isWorking(){

        // set up a current node

        LightStrand current = this;

        if (current == null) return false;

        // traverse lightStrand links
        while ( current.getNext() != null){
            if (current.getWorks() == false)
                return false;
            else
                current = current.getNext();
        }
        return current.getWorks();
    }

    public boolean isWorking(LightStrand current){
        if(current == null){
            return false;
        }
        else if(current.getWorks() == false){
            return false;
        }
        else{
            isWorking(current.getNext());
        }

        return true;
    }

}
