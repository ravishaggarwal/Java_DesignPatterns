package mytest.myexample.datastructure.sorting;


import java.util.Random;


public class DataStructure_QuickSort_JavaProgram 
{
	public static int[] sort(int[] intArray){
        intArray =quickSort(intArray, 0, intArray.length-1);
        return intArray;
    }
   
    public static int[] quickSort(int intArray[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = intArray[(low + high)/2];
        while (i <= j){
            while (intArray[i] < pivot)
                i++;
            while (intArray[j] > pivot)
                j--;
            if (i <= j){
                temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j){
        	quickSort(intArray, low, j);
        }
        	
        if (i < high){
        	quickSort(intArray, i, high);
        }
      return intArray;
    }
    
    public static void printIntArray(int[] sortedIntArray){
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