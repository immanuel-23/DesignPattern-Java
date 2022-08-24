package com.aurionpro.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cat;
import com.aurionpro.model.ChildMethod;
import com.aurionpro.model.ParentMethod;
import com.aurionpro.model.Tiger;

public class AnimalTest {
	static String user_input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		myCat.sound();
//		String input=args[0];
//		//Annotation annotaionName = args[0];s
		System.out.println("*******Custom annotation method of cat*********");
		for(Method method:myCat.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(ChildMethod.class)) {
				System.out.println(method.getName());
			}
		}
		System.out.println("*******Custom annotation method of Tiger***********");

		Tiger myTiger = new Tiger();
		for(Method method:myTiger.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(ChildMethod.class)) {
				System.out.println(method.getName());
			}
		}
	
		

		
//		if(myCat.getClass().isAnnotationPresent(ChildMethod.Method)) {
//			System.out.println("True");
//		}
		
		
		

	}

}
