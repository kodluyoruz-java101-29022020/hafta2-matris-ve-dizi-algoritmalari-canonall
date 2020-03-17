package soru3;

public class Main {

	public static void main(String[] args) {
		int[][] matrice1 = MatriceOperations.fillMatrice(3, 4);
		MatriceOperations.printMatrice(matrice1);

		System.out.println("-------------------");

		int[][] matrice2 = MatriceOperations.fillMatrice(4, 5);
		MatriceOperations.printMatrice(matrice2);

		System.out.println("-------------------");

		int[][] resultMatrice = MatriceOperations.multiplyMatrices(matrice1, matrice2);

		if (resultMatrice == null) {
			System.out.println("Matrice sizes are not valid for multiplication");
			System.out.println("First matrice's column count must be equal to second matrice's row count!");
		} else {
			MatriceOperations.printMatrice(resultMatrice);
		}
	}

}
