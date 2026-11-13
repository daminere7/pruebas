package proy_entornos;

import java.util.Arrays;

public class IniciacionArrays4 {

	public static int[] ordenarEnteros(int[] a, int[] b) {
		int resultado[];
		if (a.length > b.length) {
			resultado = a.clone();
			for (int indice = 0; indice < b.length; indice++) {
				if (b[indice] > resultado[indice]) {
					resultado[indice] = b[indice];
				}
			}
		} else {

			resultado = b.clone();
			for (int indice = 0; indice < a.length; indice++) {
				if (a[indice] > resultado[indice]) {
					resultado[indice] = a[indice];
				}
			}
		}
		return resultado;
	}

	public static void main(String arg[]) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 1, 1, 6 };
		int[] resultado = ordenarEnteros(a, b);
		System.out.println(Arrays.toString(resultado));

	}

}