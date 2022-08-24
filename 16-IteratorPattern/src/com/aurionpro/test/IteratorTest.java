package com.aurionpro.test;

import com.aurionpro.model.IIterator;
import com.aurionpro.model.NameRepository;
import com.aurionpro.model.NameRepositoryArrayList;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository name = new NameRepository();
		for (IIterator iter = name.getIterator(); iter.hasNext();) {
			String name1 = (String) iter.next();
			System.out.println("Name : " + name1);
		}
		System.out.println("______________________________________________");
		NameRepositoryArrayList nameArray = new NameRepositoryArrayList();

		for (IIterator iter = nameArray.getIterator(); iter.hasNext();) {
			String name1 = (String) iter.next();
			System.out.println("Name : " + name1);
		}

	}

}
