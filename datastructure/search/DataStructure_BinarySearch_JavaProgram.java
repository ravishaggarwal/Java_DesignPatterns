package mytest.myexample.datastructure.search;

import java.util.Random;

public class DataStructure_BinarySearch_JavaProgram{    
	 public static int binarySearch(int intArray[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( intArray[mid] < key ){  
		        first = mid + 1;     
		      }else if ( intArray[mid] == key ){  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }
		   return mid;
		 }  
	
	public static void printIntArray(int[] sortedIntArray)throws Exception{
    	System.out.print("\n");
        for (int i = 0; i < sortedIntArray.length; i++)
            System.out.print( sortedIntArray[i] + "  ");
        }
	
    public static void main(String a[]){    
     try{
        System.out.println("Preparing the sequence of numbers by using Java Random facility");
        Random random = new Random();
        int sizeOfIntArray = random.nextInt(100);
        int key = random.nextInt(100);
        int[]intArray = new int[sizeOfIntArray];
        int last=intArray.length-1;
        int first =0;
        for (int i=0; i<sizeOfIntArray;i++)
        	intArray[i] = Math.abs(random.nextInt(100));
        System.out.println(" \n The original list of elements in Int Array: ");
        printIntArray(intArray);
         System.out.println("\n The Provided key i.e. "+key+" is found at index: " + binarySearch(intArray, first, last, key) );    
     	}catch(Exception e){
    		System.err.println("The exception occured in the program " +e.getMessage());
    		e.printStackTrace();
    	}
    }    
}    