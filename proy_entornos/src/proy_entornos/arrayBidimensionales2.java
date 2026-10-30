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

		for (int col = 0; col < maxColumnas; col++) {
			System.out.println("Columna " + (col + 1) + ": ");
			for (int fila = 0; fila < numeros.length; fila++) {
				if (col < numeros[fila].length) {
					System.out.print(numeros[fila][col]);
				} else {
					System.out.print("-");
				}
				if (fila < numeros.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}