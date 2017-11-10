package mytest.myexample;

//Here in this program/project we have added the jar(TestSingltonLoading.jar) that contains the same SingletonJar class with same package name.
//As we are imported the jar(TestSingltonLoading.jar), so it is not giving the error of existing of same class in the project, but will call or give  
//preference of  SingletonJar class defined in this project only 

public class TestSingletonClassLoadingBYClassLoader {
  public static void main(String sg[]){
	  SingletonJar mySingleton = SingletonJar.getInstance();
	  
	 System.out.println("the object is " +mySingleton);
  // so here the class SingletonJar will be used , hoever if we commnt the class SingletonJar, then the code will
  //use the same class available in jar( imported in build path externally).
  // this means class with same name/package structure availale in local project and jar ( externally added) is
  //loaded only once by class loader. 
	  
  }
}

 class SingletonJar {
	private int param;
    private static volatile  SingletonJar mySingleton = null;

   private SingletonJar() {
     param=1;
   }

   public static synchronized SingletonJar getInstance() {
      if(mySingleton == null) {
         mySingleton = new SingletonJar();
      }
      return mySingleton;
   }

   public void setParam(int param){
	   this.param = param;
   }
   
   public int getParam(){
	   return param;
   }
 
}

