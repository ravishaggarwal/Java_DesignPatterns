package mytest.myexample.designpattern.BuilderPattern;



public class MarutiCarBuilder extends CarBuilder {
	
	@Override
	public void buildDoors() {
		this.car.setDoors("there would be 5 Doors");
		
	}

	@Override
	public void buildEngineDisplacementSize() {
		this.car.setEngineDisplacement("the engine will be 1200 CC");
		
	}

	@Override
	public void buildVarient() {
		this.car.setVarient("The varient would be Swift");
		
	}

	@Override
	public void buildGearBox() {
		this.car.setGearBox("the gearBox would be Manual");
		
	}
}
