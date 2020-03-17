package soru3;

public class MatriceOperations {

	private static final int scaleValue = 10;

	public static void printMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[0].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Size: " + matrice.length + "x" + matrice[0].length);
	}

	public static int[][] fillMatrice(int rowCount, int columnCount) {

		int[][] matrice = new int[rowCount][columnCount];

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				int matriceValue = (int) (Math.random() * scaleValue);
				matrice[i][j] = matriceValue;
			}
		}

		return matrice;

	}

	public static int[][] multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice) {
		boolean isValidForMultiplication;
		isValidForMultiplication = checkValidationForMultiplication(firstMatrice[0].length, secondMatrice.length);

		if (isValidForMultiplication) {
			int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];

			for (int i = 0; i < resultMatrice.length; i++) {

				for (int j = 0; j < resultMatrice[0].length; j++) {

					int sum = 0;
					for (int k = 0; k < secondMatrice.length; k++) {
						sum = sum + (firstMatrice[i][k] * secondMatrice[k][j]);
					}
					resultMatrice[i][j] = sum;
				}
			}

			return resultMatrice;

		} else {
			int[][] resultMatice = null;
			return resultMatice;
		}
	}

	private static boolean checkValidationForMultiplication(int firstMaticeColumnCount, int secondMatriceRowCount) {
		return (firstMaticeColumnCount == secondMatriceRowCount);
	}
}
