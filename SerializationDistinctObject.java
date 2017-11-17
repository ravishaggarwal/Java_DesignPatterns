package mytest.myexample;

import java.io.*;

class ClassOne implements Serializable {
    
	private static final long serialVersionUID = 986565677L;
	int classOne;
 }

class ClassTwo implements Serializable {
    
	private static final long serialVersionUID = 8644687655L;
	int classTwoMemberVariable; ClassOne classOneReference;
    ClassTwo(int classTwoMemberVariable, ClassOne classOneReference) {
        this.classTwoMemberVariable = classTwoMemberVariable;
        this.classOneReference = classOneReference;
    }

    void ClassTwoPrintMethod() {
       System.out.print("\n the object is  " + classOneReference.toString());
    }

}

class SerializationDistinctObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	File fileObject =  null; 
    	OutputStream outputStream = null;
    	InputStream inputStream = null;
    	ObjectOutputStream objectOutputStreamObjectOne = null;
    	ObjectOutputStream objectOutputStreamObjectTwo = null;
    	ObjectInputStream objectInputStreamObjectOne = null;
    	ObjectInputStream objectInputStreamObjectTwo =null;
    	try{
	        fileObject = new File("SerializedObject.dat");
	       
	        ClassOne classOneObject = new ClassOne();
	        ClassTwo classTwoObjectOne = new ClassTwo(1, classOneObject);
	        ClassTwo classTwoObjectTwo = new ClassTwo(2, classOneObject);
	        classTwoObjectOne.classOneReference.classOne = 3;
	        classTwoObjectTwo.classOneReference.classOne = 4;
	        classTwoObjectOne.ClassTwoPrintMethod();
	        classTwoObjectTwo.ClassTwoPrintMethod();
	
	        outputStream = new FileOutputStream(fileObject);
	
	        inputStream = new FileInputStream(fileObject);
	
	        objectOutputStreamObjectOne =  new ObjectOutputStream(outputStream);
	        objectOutputStreamObjectOne.writeObject(classTwoObjectOne);
	        objectOutputStreamObjectOne.flush();
	
	        objectOutputStreamObjectTwo = new ObjectOutputStream(outputStream);
	        objectOutputStreamObjectTwo.writeObject(classTwoObjectTwo);
	        objectOutputStreamObjectTwo.close();
	
	        // Reading the objects from file, here the resouces will not be shared.
	        objectInputStreamObjectOne = new ObjectInputStream(inputStream);
	        ClassTwo o1i = (ClassTwo) (objectInputStreamObjectOne.readObject());
	        objectInputStreamObjectTwo = new ObjectInputStream(inputStream);
	        ClassTwo o2i = (ClassTwo) (objectInputStreamObjectTwo.readObject());
	        o1i.ClassTwoPrintMethod();
	        o2i.ClassTwoPrintMethod();
	        o1i.classOneReference.classOne = 5; 
	        o2i.classOneReference.classOne = 6;
	        o1i.ClassTwoPrintMethod();
	        o2i.ClassTwoPrintMethod();
    	}catch(Exception e){
    		System.err.println("The Exception occured in the program " +e.getMessage());
    		e.printStackTrace();
    	}
    	finally{
    		if(objectInputStreamObjectOne !=null){
    			objectInputStreamObjectOne.close();
    		}
    		if(objectInputStreamObjectTwo !=null){
    			objectInputStreamObjectTwo.close();
    		}
    	}
    }
}