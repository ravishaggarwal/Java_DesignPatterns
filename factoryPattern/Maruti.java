package mytest.myexample.designpattern.factoryPattern;


public class Maruti implements Cars{
	 
    @Override
    public String getEngineDisplacement() {
         
        return "1198";
    }
    
    @Override
    public String getVarient() {
         
        return "Swift";
    }
 
    @Override
    public String getDoorCount() {
         
        return "5";
    }
}
