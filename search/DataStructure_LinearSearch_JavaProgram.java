package mytest.myexample.datastructure.search;

import java.util.Random;

public class DataStructure_LinearSearch_JavaProgram{    
	public static int linearSearch(int[] arr, int key){    
	        for(int i=0;i<arr.length;i++){    
	            if(arr[i] == key){    
	                return i;    
	            }    
	        }    
	        return -1;    
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
        for (int i=0; i<sizeOfIntArray;i++)
        	intArray[i] = Math.abs(random.nextInt(100));
        System.out.println(" \n The original list of elements in Int Array: ");
        printIntArray(intArray);
         System.out.println("\n The Provided key i.e. "+key+" is found at index: "+linearSearch(intArray, key));    
     	}catch(Exception e){
    		System.err.println("The exception occured in the program " +e.getMessage());
    		e.printStackTrace();
    	}
    }    
}    