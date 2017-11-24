package mytest.myexample.datastructure.sorting;

import java.util.Random;

public class DataStructure_InsertionSort_JavaProgram{
    public static int[] sort( int intArray[]) throws Exception{
        int size = intArray.length;
        int i,j,temp;
        for (i=1; i<size; i++){
            j = i;
            temp = intArray[i];    
            while (j>0 && temp<intArray[j-1]){
                intArray[j] = intArray[j-1];
                j = j-1;
            }
            intArray[j] = temp;            
        }
        return intArray;
    }    
    
    public static void printIntArray(int[] sortedIntArray) throws Exception{
    	System.out.print("\n");
        for (int i = 0; i < sortedIntArray.length; i++)
            System.out.print( sortedIntArray[i] + "  ");
        }
     
      public static void main(String args[]){
    	try{
            System.out.println("Preparing the unsorted sequence of numbers by using Java Random facility");
            Random random = new Random();
            int sizeOfIntArray = 10;
            int[]intArray = new int[sizeOfIntArray];
            for (int i=0; i<sizeOfIntArray;i++)
                intArray[i] = Math.abs(random.nextInt(100));
     
            System.out.println(" \n The original list of elements in Int Array: ");
            printIntArray(intArray);
     
            System.out.println(" \n The Sorted list of elements in Int Array: ");
            printIntArray(sort(intArray));
    	}catch(Exception e){
    		System.err.println("The exception occured in the program " +e.getMessage());
    		e.printStackTrace();
    	}
     }
}
