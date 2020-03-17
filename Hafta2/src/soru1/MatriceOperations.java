package soru1;

public class MatriceOperations {

	public static int[][] fillMatrices(int rowCount, int columnCount) {
		int[][] finalMatrice = new int[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				finalMatrice[i][j] = (int) Math.round(Math.random());
			}
		}
		return finalMatrice;
	}

	public static void printMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[0].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] transformCells(int[][] matrice) { // returns output as a matrice
		int[][] outputMatrice = new int[matrice.length][matrice[0].length];

		for (int i = 1; i < matrice.length - 1; i++) {
			for (int j = 1; j < matrice[0].length - 1; j++) {
				int aliveCellCount = 0;
				for (int k = -1; k <= 1; k++) {
					for (int l = -1; l <= 1; ++l) {
						aliveCellCount += matrice[i + k][j + l];
					}
				}
				aliveCellCount -= matrice[i][j];
				if ((matrice[i][j] == 1) && (aliveCellCount < 2)) {
					outputMatrice[i][j] = 0;
				} else if ((matrice[i][j] == 1) && (aliveCellCount > 3)) {
					outputMatrice[i][j] = 0;
				} else if ((matrice[i][j] == 0) && (aliveCellCount == 3)) {
					outputMatrice[i][j] = 1;
				} else {
					outputMatrice[i][j] = matrice[i][j];
				}
			}
		}
		return outputMatrice;
	}
}
