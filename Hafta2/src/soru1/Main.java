package soru1;

public class Main {

	public static void main(String[] args) {
		int[][] matrice = MatriceOperations.fillMatrices(3, 3);
		// int[][] matrice = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		/*
		 * int[][] matrice = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1, 0, 0,
		 * 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		 * }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, { 0,
		 * 0, 1, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0,
		 * 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		 */
		MatriceOperations.printMatrice(matrice);

		System.out.print("---------------------------------\n");
		matrice = MatriceOperations.transformCells(matrice);
		MatriceOperations.printMatrice(matrice);

	}

}
