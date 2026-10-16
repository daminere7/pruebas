package proy_entornos;

import java.util.Scanner;

public class fig4 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int altura = escaner.nextInt();

		for (int i = 1; i <= altura; ++i) {
			dibujaFila(altura, i);
		}

		System.out.println();

		for (int i = altura; i >= 1; --i) {
			dibujaFila(altura, i);
		}

		escaner.close();
	}

	static void dibujaFila(int altura, int i) {
		int asteriscos = altura - i + 1;
		int espacios = 2 * i - 1;

		for (int j = 1; j <= asteriscos; ++j)
			System.out.print("*");
		for (int j = 1; j <= espacios; ++j)
			System.out.print(" ");
		for (int j = 1; j <= asteriscos; ++j)
			System.out.print("*");

		System.out.println();
	}
}
