package mytest.myexample;

public class SingletonCloneable_AvoidanceExample {

    public static void main(String[] args) {
    	try{
    		MyColenableSingleton myColenableSingleton = MyColenableSingleton.getInstance();
	          System.out.println("Getting first time singleton object : " + myColenableSingleton);
	 
	          MyColenableSingleton myColenableSingleton1 = (MyColenableSingleton)myColenableSingleton.clone();
	          System.out.println("Getting myColenableSingleton1 object : " + myColenableSingleton1);
	         
    	}catch(Exception e){
    		System.err.println("\n Exception occured " + e.getMessage());
    		e.printStackTrace();
    	}
    }
}

 class MyColenableSingleton implements Cloneable {
  
	 private static final long serialVersionUID = 19353363535L;
	 private static volatile  MyColenableSingleton mySingleton = null;
	 private MyColenableSingleton() {
	 }

   public static synchronized MyColenableSingleton getInstance() {
      if(mySingleton == null) {
         mySingleton = new MyColenableSingleton();
      }
      return mySingleton;
   }

 // Here if the clone object will retrun the cloned singlton object,then this break down the singleton principals
 // So to avoid the singleton cloning, throw right exception.
   public Object clone()throws CloneNotSupportedException{  
	   // return super.clone();
		throw new CloneNotSupportedException();
		}  
 }

