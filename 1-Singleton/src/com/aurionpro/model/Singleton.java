package com.aurionpro.model;

import java.io.Serializable;

public class Singleton implements Serializable {
//	static Singleton instance;
//
////	private Singleton() {
////
////	}
//
//	static public Singleton getInstance() {
//
//		if (instance == null)
//			instance = new Singleton();
//
//		return instance;
//
////	}
////	private Object readResolve() {
////	    return instance;

	private  static Singleton instance;

//	private Singleton() {
//// this is constructor 
//	}
	static public Singleton getInstance() {

		if(instance==null)
			instance = new Singleton();
		return instance;
		
	}
}
