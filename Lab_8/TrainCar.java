package cisc181.Lab_8;

public class TrainCar {
    private String cargo;

    public TrainCar(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){ return this.cargo; }
    public void setCargo(String cargo){ this.cargo = cargo; }

    @Override
    public String toString() {
        return this.getCargo();
    }
}
