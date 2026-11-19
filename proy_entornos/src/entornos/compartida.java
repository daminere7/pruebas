package entornos;

import java.util.Arrays;
import java.util.Scanner;

public class compartida {
	private static int[][] matriz;
	private static boolean[] usados;

	private static boolean existe(int numero) {
		return usados[numero - 1];
	}

	public static int numeroAzar(int max) {
		return numeroAzar(1, max);
	}

	public static int numeroAzar(int min, int max) {
		int resultado = 0;
		do {
			resultado = (int) (Math.random() * (max - min + 1) + min);
		} while (usados[resultado - 1]);
		usados[resultado - 1] = true;
		return resultado;
	}

	public static int[][] crearMatriz() {
		boolean correcto = false;
		Scanner entrada = new Scanner(System.in);
		int opciones = 0;
		int filas = 0;
		do {
			try {
				System.out.println("Introduce el numero de filas");
				filas = entrada.nextInt();
				if (filas > 0)
					correcto = true;
				else
					System.out.println("Tiene que ser mayor que 0");
			} catch (Exception ex) {
				System.out.println("Eso no es un numero");
			} finally {
				entrada.nextLine();
			}
		} while (!correcto);
		correcto = false;

		matriz = new int[filas][];
		for (int i = 0; i < matriz.length; i++) {
			do {
				try {
					System.out.println("Introduce el numero de columnas para la fila [" + i + "]: ");
					int columnas = entrada.nextInt();
					if (columnas >= 0) {
						matriz[i] = new int[columnas];
						opciones += columnas;
						correcto = true;
					} else {
						System.out.println("No puede ser negativo");
					}
				} catch (Exception ex) {
					System.out.println("Eso no es un numero");
				} finally {
					entrada.nextLine();
				}
			} while (!correcto);
			correcto = false;
		}
		usados = new boolean[opciones];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroAzar(opciones);
			}
		}
		entrada.close();
		return matriz;
	}

	public static void main(String[] args) {
		int[][] matriz = crearMatriz();
		System.out.println(Arrays.deepToString(matriz));
	}
}