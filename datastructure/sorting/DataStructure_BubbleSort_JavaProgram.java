package mytest.myexample.datastructure.sorting;

import java.util.Random;

public class DataStructure_BubbleSort_JavaProgram {
  
 public static int[]sort(int[] intArray) 
    {
  // Here in the bubble sort, the array elements will compared with next ones and get swapped.
    for (int i=0;i<intArray.length;i++)
        for (int j=0; j<intArray.length-1;j++)
            if (intArray[j]>intArray[j+1]){
            	intArray[j]=intArray[j]+intArray[j+1];
            	intArray[j+1]=intArray[j]-intArray[j+1];
            	intArray[j]=intArray[j]-intArray[j+1];
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

