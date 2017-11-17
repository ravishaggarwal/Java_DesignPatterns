package mytest.myexample.designpattern.factoryPattern;


public class CarFactory {
	 public static Cars getEngineDisplacemtnByVarient(String varientName) throws Exception{
         
        if("swift".equalsIgnoreCase(varientName)){
            return new Maruti();
        } else if("Audi".equalsIgnoreCase(varientName)){
            return new Audi();
        }
        throw new Exception("Invalid Car Varient..." + varientName);
    }
     
     
    public static void main(String ag[]){
        Cars maruti;
        try {
        	maruti = CarFactory.getEngineDisplacemtnByVarient("Swift");
        	System.out.println("The Varient of Maruti  is " +maruti.getVarient());
            System.out.println("The Engine displacement of Maruti  is " +maruti.getEngineDisplacement());
            System.out.println("The No of doors in Maruti is " +maruti.getDoorCount());
        } catch (Exception e) {
        	System.err.println("The exception occured in the program "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
