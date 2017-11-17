package mytest.myexample.designpattern.factoryPattern;


public class Audi implements Cars{
	 
    @Override
    public String getEngineDisplacement() {
         
        return "1968";
    }
    
    @Override
    public String getVarient() {
         
        return "Q3";
    }
 
    @Override
    public String getDoorCount() {
         
        return "2";
    }
}