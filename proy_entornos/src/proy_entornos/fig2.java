package proy_entornos;

import java.util.Scanner;

public class fig2 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int altura = escaner.nextInt();
		System.out.print("Introduce relleno 1 o sin relleno 0");
		int relleno = escaner.nextInt();

		for (int i = 1; i <= altura; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (j != 1 && i != altura && i != j && relleno != 1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}

			System.out.println();
		}

		escaner.close();
	}
}
