
package mytest.myexample;

import java.util.*;

class StackClass
{
    protected int stackArray[];
    protected int top, size, len;
    public StackClass(int n){
        size = n;
        len = 0;
        stackArray = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
  
    public boolean isFull(){
        return top == size -1 ;        
    }
   
    public int getSize(){
        return len ;
    }

    public int peek(){
        if( isEmpty() )
            throw new NoSuchElementException("Stack is underflowed");
        return stackArray[top];
    }
   
    public void push(int i)
    {
        if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Stack is overflowed");
        if(top + 1 < size )
            stackArray[++top] = i;
        len++ ;
    }
   
    public int pop()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Stack is underflowed");
        len-- ;
        return stackArray[top--]; 
    }    
  
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(stackArray[i]+" ");
        System.out.println();
    }    
}
 
public class Stack_Operations_JavaProgram
{
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);  
        try{
	        System.out.println("Enter initial INTEGER value that define the size of Stack ");
	        int stackSize = scannerObject.nextInt();
	        StackClass stackClassObject = new StackClass(stackSize);
	        char ch;
	        do{
	            System.out.println("\n Following are the Stack Operations, So press respective Integer for associated Operation");
	            System.out.println("1. PUSH Operation");
	            System.out.println("2. POP Operation");
	            System.out.println("3. PEEK Operation");
	            System.out.println("4. Is Stack Empty");
	            System.out.println("5. Is Stack Full");
	            System.out.println("6. Size of Stack");
	            int inputOperationValue = scannerObject.nextInt();
	            switch (inputOperationValue){
	            case 1 : 
	                System.out.println("Enter integer element for Push Operation");
	                try {
	                    stackClassObject.push( scannerObject.nextInt() );
	                }catch (Exception e){
	                    System.out.println("Error Occured in Push Operation : " + e.getMessage());
	                    e.printStackTrace();
	                }                         
	                break;                         
	            case 2 : 
	                try{
	                    System.out.println("POP Operation done and element is " + stackClassObject.pop());
	                }catch (Exception e){
	                    System.out.println("Error Occured in POP Operation : " + e.getMessage());
	                }    
	                break;                         
	            case 3 :         
	                try{
	                    System.out.println("PEEK Operation done and element is " + stackClassObject.peek());
	                }catch (Exception e){
	                    System.out.println("Error Occured in PEEK Operation : " + e.getMessage());
	                }
	                break;                         
	            case 4 : 
	                System.out.println("Stack Empty status is " + stackClassObject.isEmpty());
	                break;                
	            case 5 :
	                System.out.println("Stack Full status " + stackClassObject.isFull());
	                break;                 
	            case 6 : 
	                System.out.println("Size of Stack is " + stackClassObject.getSize());
	                break;                         
	            default : 
	                System.out.println("User has entered the wrong input \n ");
	                break;
	            }
	            stackClassObject.display();            
	            System.out.println("\n Do you want to continue for other options (Type y or n) \n");
	            ch = scannerObject.next().charAt(0);
	        } while (ch == 'Y'|| ch == 'y');                 
	    }catch(Exception e){
	    	System.err.println("The exception occured in the program " +e.getMessage());
	    	e.printStackTrace();
	    }finally{
	    	if(scannerObject !=null){
	    		scannerObject.close();
	    	}
	    }
    }
}
