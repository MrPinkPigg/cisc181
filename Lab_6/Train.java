/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_6;

public class Train {
    private TrainCar head;

    /*
    constructor for a Train
     */
    public Train(){
        this.head = null;
    }

    /*
    gets the head traincar's cargo
     */
    public String getHeadCargo() { return this.head.getCargo(); }

    /*
    adds a new traincar to the front of a train
     */
    public void attachAtFront(String newCargo){
        this.head = new TrainCar(newCargo, this.head);
    }

    /*
    removes the first traincar and returns it's cargo
     */
    public String removeFromFront(){
        if(this.head != null) {
            String temp = this.head.getCargo();
            this.head = this.head.getNext();
            return temp;
        }
        else{
            return null;
        }
    }

    /*
    adds a traincar at the end of the train
     */
    public void attachAtEnd(String newCargo){
        TrainCar temp = this.head;

        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new TrainCar(newCargo, null));
        System.out.println(this.getHeadCargo());
    }
}
