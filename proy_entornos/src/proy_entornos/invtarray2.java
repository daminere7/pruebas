package proy_entornos;

import java.util.Arrays;

public class invtarray2 {

	public static int[][] matrizAleatoria(int minFilas, int maxFilas, int minCol, int maxCol, int maxValor) {
		int filas = random(minFilas, maxFilas);
		int[][] matriz = new int[filas][];
		for (int i = 0; i < filas; i++) {
			int columnas =random(minCol,maxCol);
			matriz[i] = new int[columnas];
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = random(maxValor);
			}
		}
		return matriz;
	}
	public static int random (int max) {
		return random(0,max);
	}
	public static int random (int min, int max) {
		return (int) (Math.random() * (max + 1-min)+min);
	}

	public static void imprimirTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

	public static void main(String[] args) {
		imprimirTabla(matrizAleatoria(1, 5, 1, 5, 12));
	}

}
