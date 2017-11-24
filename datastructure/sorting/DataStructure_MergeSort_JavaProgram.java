package mytest.myexample.datastructure.sorting;

import java.util.Random;


public class DataStructure_MergeSort_JavaProgram{

    public static void sort(int[] intArray, int low, int high) throws Exception{
        int difference = high-low;         
        if (difference <= 1) 
            return; 
        int mid = low + difference/2; 
      
        sort(intArray, low, mid); 
        sort(intArray, mid, high); 
        
        int[] tempArray = new int[difference];
        int i=low, j=mid;
        for (int k=0; k<difference; k++) 
        {
            if (i==mid)  
                tempArray[k]=intArray[j++];
            else if (j==high) 
                tempArray[k]=intArray[i++];
            else if (intArray[j]<intArray[i]) 
                tempArray[k]=intArray[j++];
            else 
                tempArray[k]=intArray[i++];
        }    
        for (int k=0; k<difference; k++) 
            intArray[low+k] = tempArray[k];         
    }
    
    public static void printIntArray(int[] sortedIntArray)throws Exception{
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
            sort(intArray,0,intArray.length);
            printIntArray(intArray);
    	}catch(Exception e){
    		System.err.println("The exception occured in the program " +e.getMessage());
    		e.printStackTrace();
    }
   }
}