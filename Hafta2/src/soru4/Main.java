package soru4;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		int arrayLength = (int) (Math.random() * ArrayOperations.scaleValue);
		System.out.println("Array length: " + arrayLength);
		System.out.println("-------------------");

		int[] array = ArrayOperations.fillArray(arrayLength); // set array size
		ArrayOperations.printArray(array);

		System.out.println("\n-------------------");

		List<Integer> repeatingNumbers = ArrayOperations.findRepeatingNumbers(array);

		if (repeatingNumbers.size() == 0) {
			System.out.print("No dublicate numbers in the array");
		} else {
			System.out.print("Repeating numbers:");
			ArrayOperations.printList(repeatingNumbers);
		}

	}

}
