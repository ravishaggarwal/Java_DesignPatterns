package mytest.myexample.designpattern.BuilderPattern;

public class CarMaker {
	 
    private CarBuilder carBuilder = null;
     
    public void setCarBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
     
    public Car getCar(){
        return this.carBuilder.getCar();
    }
     
    public void constructCamara(){
        this.carBuilder.createNewCar();
        this.carBuilder.buildDoors();
        this.carBuilder.buildGearBox();
        this.carBuilder.buildEngineDisplacementSize();
        this.carBuilder.buildVarient();
    }
}
