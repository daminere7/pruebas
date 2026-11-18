package proy_entornos;

import java.util.Arrays;

public class matrizAleatoria {

	public static int[][] matrizAleatoria(int tamaño, int max) {
		int[][] matriz = new int[tamaño][tamaño];
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				matriz[i][j] = (int) (Math.random() * (max + 1));
			}
		}
		return matriz;
	}

	public static void imprimirTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

	public static void main(String[] args) {
		imprimirTabla(matrizAleatoria(5, 10));
	}

}
