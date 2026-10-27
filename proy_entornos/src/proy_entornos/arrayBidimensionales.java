package proy_entornos;

public class arrayBidimensionales {

	public static void main(String[] args) {
		int[][] numeros = { { 4, 5 }, { 10, 65, 7, 20 }, { 14, 8, 9 } };

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
}
