package mytest.myexample.designpattern.BuilderPattern;



public class AudiCarBuilder extends CarBuilder {
	 
	@Override
	public void buildDoors() {
		this.car.setDoors("there would be 2 Doors");
		
	}

	@Override
	public void buildEngineDisplacementSize() {
		this.car.setEngineDisplacement("the engine will be 5266 CC");
		
	}

	@Override
	public void buildVarient() {
		this.car.setVarient("The varient would be Q3");
		
	}

	@Override
	public void buildGearBox() {
		this.car.setGearBox("the gearBox would be Automatic");
		
	}
}
