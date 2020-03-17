package soru2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// int[][] matrice = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25,
		// //HARDCODED MATRICE IN QUESTION 2
		// 20, 7 }, { 14, 23, 22, 21, 8 },
		// { 13, 12, 11, 10, 9 } };

		int[][] matrice = MatriceOperations.fillMatrice(5, 5); // GENERATEs RANDOM MATRICE
		int[] array;

		MatriceOperations.printMatrice(matrice);

		System.out.print("---------------------------------\n");

		array = MatriceOperations.transformMatriceToArray(matrice); // transform matrice to an array
		MatriceOperations.printArray(array);

		System.out.println();

		Arrays.sort(array); // sort array with util

		System.out.println("---------------------------------");

		MatriceOperations.printArray(array);

	}

}
