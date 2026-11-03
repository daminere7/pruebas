package proy_entornos;

import java.util.Arrays;

public class burbuja {
// revisar el if de cambios q no funciona
	public static void main(String[] args) {
		int[] arrayEjemplo = { 3, 6, 9, 0, 1, 2, 4 };
		int[] arrayOrdenado;
		System.out.println("Sin ordenar: " + Arrays.toString(arrayEjemplo));
		arrayOrdenado = burbuja(arrayEjemplo);
		System.out.println("Ordenado: " + Arrays.toString(arrayOrdenado));
		if (arrayEjemplo.equals(arrayOrdenado)) {
			System.out.println("No hay cambios");
		} else {
			System.out.println("Hay cambios");
		}
	}
//
	public static int[] burbuja(int[] vector) {
		int aux;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - i - 1; j++) {
				// El valor máximo lo más a la derecha posible
				if (vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
		return vector;
	}
}
