package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WaysToBreak {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		

	Singleton originalSingletonInsatnce=Singleton.getInstance();
	
	Singleton duplicateInstance=Singleton.getInstance();
	
	System.out.println(originalSingletonInsatnce.hashCode());
	System.out.println(duplicateInstance.hashCode());

	//Now lets see how to break to singleton design pattern
	
	//Serialization
	
System.out.println("-----------------------------------------");

	ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\newfile.txt"));

	obj.writeObject(originalSingletonInsatnce);
	obj.close();
	

	ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\newfile.txt"));

	Singleton duplicateInstanc1=(Singleton)obj1.readObject();
	
	
	System.out.println(originalSingletonInsatnce.hashCode());
	System.out.println(duplicateInstanc1.hashCode());
	
	
	System.out.println("-----------------------------------------");
	
	//breaking using clone method
	
	//Singleton brokenusingcloning=originalSingletonInsatnce.
	
	
	}
}