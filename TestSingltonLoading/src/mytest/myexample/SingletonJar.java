package mytest.myexample;

import java.io.Serializable;

public class SingletonJar {
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
