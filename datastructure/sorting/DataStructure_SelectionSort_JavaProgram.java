package mytest.myexample.datastructure.sorting;

import java.util.Random;

public class DataStructure_SelectionSort_JavaProgram 
{
	public static int[] sort(int[] intArray){
  // Here in the Selection sort to sort the integer array.
    	int size = intArray.length;
        int i, j, position, temp;
        for (i = 0; i<size-1; i++){
            position = i;
            for (j=i+1; j<size; j++){
                if (intArray[j]<intArray[position]){
                    position = j;
                }
            }
            temp = intArray[i];
            intArray[i] = intArray[position];
            intArray[position]= temp;            
        }  
        return intArray;
    }
    public static void printIntArray(int[] sortedIntArray){
        for (int i = 0; i < sortedIntArray.length; i++)
            System.out.print(sortedIntArray[i] + "  ");
        }
     
      public static void main(String args[]){
    	try{
            System.out.println("Preparing the unsorted sequence of numbers by using Java Random facility");
            Random random = new Random();
            int sizeOfIntArray = 30;
            int[]intArray = new int[sizeOfIntArray];
            for (int i=0; i<sizeOfIntArray;i++)
                intArray[i] = Math.abs(random.nextInt(100097));
     
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

