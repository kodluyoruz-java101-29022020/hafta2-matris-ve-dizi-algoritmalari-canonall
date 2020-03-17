package soru2;

public class MatriceOperations {

	public static void printMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[0].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] transformMatriceToArray(int[][] matrice) {
		int[] array = new int[(matrice.length * matrice[0].length)];
		int k = 0;

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[0].length; j++) {
				array[k] = matrice[i][j];
				k++;
			}
		}

		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[][] fillMatrice(int rowCount, int columnCount) {

		int[][] matrice = new int[rowCount][columnCount];

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				int matriceValue = (int) (Math.random() * 100);
				matrice[i][j] = matriceValue;
			}
		}

		return matrice;

	}
}
