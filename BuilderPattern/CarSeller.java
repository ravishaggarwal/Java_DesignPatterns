package mytest.myexample.designpattern.BuilderPattern;


public class CarSeller {
	 
    public static void main(String a[]){
        CarMaker carMaker = new CarMaker();
        CarBuilder audiCarBuilder = new AudiCarBuilder();
        carMaker.setCarBuilder(audiCarBuilder);
        carMaker.constructCar();
        Car car = carMaker.getCar();
        System.out.println("the car build is " +car.toString());
    }
}
