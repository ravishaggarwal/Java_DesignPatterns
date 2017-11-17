package mytest.myexample.designpattern.BuilderPattern;


public abstract class CarBuilder {
	 
    protected Car car;
     
    public Car getCar(){
        return this.car;
    }
     
    public void createNewCar(){
        this.car = new Car();
    }
     
    public abstract void buildDoors();
    public abstract void buildEngineDisplacementSize();
    public abstract void buildVarient();
    public abstract void buildGearBox();
}
