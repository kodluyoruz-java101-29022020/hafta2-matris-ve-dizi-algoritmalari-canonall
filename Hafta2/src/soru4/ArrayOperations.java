package soru4;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
	public static final int scaleValue = 100;

	public static int[] fillArray(int arrayLength) {

		int[] resultArray = new int[arrayLength];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (int) (Math.random() * scaleValue);
		}
		return resultArray;
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static List<Integer> findRepeatingNumbers(int[] array) {

		List<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					boolean isAlreadyExistInList = checkAlreadyExistInList(array[i], resultList);

					if (isAlreadyExistInList) {
						break;
					} else {
						resultList.add(array[i]);
					}
				}
			}
		}
		return resultList;
	}

	private static boolean checkAlreadyExistInList(int element, List<Integer> resultList) {

		if (resultList.equals(null)) {
			return false;
		} else {
			for (int i = 0; i < resultList.size(); i++) {

				if (element == resultList.get(i)) {
					return true;
				}
			}
			return false;
		}
	}

	public static void printList(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print("" + list.get(i) + " ");
		}

	}

}
