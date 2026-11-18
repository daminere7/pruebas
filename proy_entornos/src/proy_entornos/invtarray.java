package proy_entornos;

import java.util.Arrays;

public class invtarray {

	public static int[][] matrizAleatoria(int tamaño, int max) {
		int[][] matriz = new int[tamaño][tamaño];
		boolean[] usado = new boolean[max + 1];
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				int num = (int) (Math.random() * (max + 1));
				while (usado[num]) {
					num = (int) (Math.random() * (max + 1));
				}
				usado[num] = true;
				matriz[i][j] = num;
			}
		}
		System.out.println(Arrays.toString(usado));
		return matriz;
	}

	public static void imprimirTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

	public static void main(String[] args) {
		imprimirTabla(matrizAleatoria(3,8));
		
	}

}
