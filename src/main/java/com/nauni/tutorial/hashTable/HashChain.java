package org.com.akn;

import java.util.Arrays;

public class HashChain {

	int arraySize;
	String[] theArray;

	public void hashFunction1(String[] stringsForArray, String[] theArray) {

		for (int n = 0; n < stringsForArray.length; n++) {

			String newElementVal = stringsForArray[n];
			int arrayIndex = Integer.parseInt(newElementVal) % 29;
			System.out.println("Modulus Index = " + arrayIndex + "for value " + newElementVal);

			while (theArray[arrayIndex] != "-1") {
				++arrayIndex;
				System.out.println("Collision: Try" + arrayIndex + "Instead");
				arrayIndex %= arraySize;
			}
		}
	}
	
	 void HashFunction(int size) {
		  
		         arraySize = size;
		  
		         theArray = new String[size];
		  
		         Arrays.fill(theArray, "-1");
		  
		     }


	public void displayTheStack() {

		int increment = 0;
		for (int m = 0; m < 3; m++) {
			increment += 10;
			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();
			for (int n = increment - 10; n < increment; n++) {
				System.out.format("| %3s " + " ", n);
			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();
			for (int n = increment - 10; n < increment; n++) {
				if (theArray[n].equals("-1"))
					System.out.print("|      ");
				else
					System.out.print(String.format("| %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();
		}
	}
}
