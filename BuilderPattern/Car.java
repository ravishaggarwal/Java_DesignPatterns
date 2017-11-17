package mytest.myexample.designpattern.BuilderPattern;


public class Car {
	
	private String engineDisplacement;
    private String varient;
    private String doors;
    private String gearBox;
	
  
	public void setEngineDisplacement(String engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}	
	public void setVarient(String varient) {
		this.varient = varient;
	}
	public String getEngineDisplacement() {
		return engineDisplacement;
	}
	public String getVarient() {
		return varient;
	}
	public String getDoors() {
		return doors;
	}
	public String getGearBox() {
		return gearBox;
	}
	
	public String toString(){
		return getDoors() +":: \n"+getEngineDisplacement() +"::\n"+getGearBox()+"::\n"+getVarient();
	}
}
