package proy_entornos;

public class arrayBidimensionales2 {

	public static void main(String[] args) {
		int[][] numeros = { { 4, 5 }, { 10, 65, 7, 20 }, { 14, 8, 9 } };

		int maxColumnas = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i].length > maxColumnas) {
				maxColumnas = numeros[i].length;
			}
		}

		for (int j = 0; j < maxColumnas; j++) {
			for (int i = 0; i < numeros.length; i++) {
				if (j < numeros[i].length) {
					System.out.print(numeros[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}