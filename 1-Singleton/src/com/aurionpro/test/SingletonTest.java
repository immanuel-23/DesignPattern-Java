package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton sobj1= Singleton.getInstance();
//		System.out.println(sobj1.hashCode());
//
//        try {
//			FileOutputStream file = new FileOutputStream("test.txt");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//            out.writeObject(Singleton.getInstance());
//            
//            out.close();
//            file.close();
//            System.out.println("Object has been serialized");
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Singleton sobj4= null;
//		
//		FileInputStream file;
//		try {
//			file = new FileInputStream("test.txt");
//	        ObjectInputStream in = new ObjectInputStream(file);
//	        sobj4=(Singleton) in.readObject();
//	        in.close();
//	        file.close();
//	        System.out.println("Object has been deserialized");
//	        System.out.println(sobj4.hashCode());
//
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//          
//  
    

		//Singleton sobj1= Singleton.getInstance();
//		Singleton sobj2= Singleton.getInstance();
//		Singleton sobj3= Singleton.getInstance();
//		
//		System.out.println(sobj1.hashCode());
//		System.out.println(sobj2.hashCode());
//		System.out.println(sobj3.hashCode());

		
		Singleton obj1= Singleton.getInstance();
		System.out.println(obj1.hashCode());
		Singleton obj2= Singleton.getInstance();
		System.out.println(obj2.hashCode());
		//Singleton.instance=null;
		Singleton obj3= Singleton.getInstance();
		System.out.println(obj3.hashCode());
		


	}

}
