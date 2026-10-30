package proy_entornos;

public class Matrices2 {

	public static int[][] crearMatriz(int n) {
		int[][] matriz = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		return matriz;
	}
	public static void imprimirMatriz(int[][] m) {
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m.length; col++) {
				if (m[fila][col] == 1) {
					System.out.print("X ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matriz = crearMatriz(4);
		imprimirMatriz(matriz);
	}
}