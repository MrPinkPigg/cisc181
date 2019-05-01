package cisc181.Lab_8;

import java.util.LinkedList;

public class Train{
    public LinkedList<TrainCar> trainList;

    public Train(){
        trainList = new LinkedList<TrainCar>();
    }

    public LinkedList<TrainCar> getTrain(){ return this.trainList; }

    public String getHeadCargo(){
        if(this.trainList.isEmpty()){
            return null;
        }
        else{
            return this.trainList.getFirst().getCargo();
        }
    }

    public void attachAtFront(String cargo){
        this.trainList.add(0, new TrainCar(cargo));
    }

    public String removeFromFront(){
        String temp;
        if(this.trainList.isEmpty()){
            return null;
        }
        else{
            temp = this.trainList.getFirst().getCargo();
            this.trainList.removeFirst();
            return temp;
        }
    }

    public void attachAtEnd(String cargo){
        this.trainList.addLast(new TrainCar(cargo));
    }

    public String removeFromEnd(){
        String temp;
        if(this.trainList.isEmpty()){
            return null;
        }
        else{
            temp = this.trainList.getLast().getCargo();
            this.trainList.removeLast();
            return temp;
        }
    }
}
