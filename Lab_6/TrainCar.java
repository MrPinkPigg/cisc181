/**
 * Aaron Knestaut
 * Cisc181
 */

package cisc181.Lab_6;

public class TrainCar {
    private String cargo;
    private TrainCar next;

    /*
    constructor for a TrainCar
     */
    public TrainCar(String cargo, TrainCar next){
        this.cargo = cargo;
        this.next = next;
    }

    /*
    getters
     */
    public String getCargo() { return this.cargo; }
    public TrainCar getNext() { return this.next; }
    /*
    setters
     */
    public void setCargo(String input) { this.cargo = input; }
    public void setNext(TrainCar input) { this.next = input; }

    @Override
    public String toString() {
        return this.getCargo();
    }
}
