package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ChocolateType;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"LEVEL of Sweetness of " + ChocolateType.KITKAT + " is :" + ChocolateType.KITKAT.levelOfSweetness);
		System.out.println(
				"LEVEL of Sweetness of " + ChocolateType.MUNCH + " is :" + ChocolateType.MUNCH.levelOfSweetness);
		System.out
				.println("LEVEL of Sweetness of " + ChocolateType.SILK + " is :" + ChocolateType.SILK.levelOfSweetness);
		System.out.println(
				"LEVEL of Sweetness of " + ChocolateType.SNICKERS + " is :" + ChocolateType.SNICKERS.levelOfSweetness);
		System.out.println("UPDATING SWEETNESS OF KITKAT");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SWEETNESS FOR KITKAT:");
		int sweetness = sc.nextInt();
		ChocolateType.KITKAT.levelOfSweetness = sweetness;
		System.out.println("UPDATED LEVEL OF SWEETNESS FOR KITKAT IS:" + ChocolateType.KITKAT.levelOfSweetness);

		ChocolateType c1 = ChocolateType.MUNCH;
		c1.SweetestChocolate();

	}

}
