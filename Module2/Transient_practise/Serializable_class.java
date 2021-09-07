package Transient_practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable_class implements Serializable {
	int i=10,j=20;
	transient int k=30;
	transient final int l=40;
	transient final int m=50;
	
	public static void main(String[] args) throws Exception {
		Serializable_class input=new Serializable_class();
		//serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(input);
		
		//deseriallization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serializable_class output=(Serializable_class)ois.readObject();
		System.out.println(output.i);
		System.out.println(output.j);
		System.out.println(output.k);
		System.out.println(output.l);
		System.out.println(output.m);
		
	}
 
}
