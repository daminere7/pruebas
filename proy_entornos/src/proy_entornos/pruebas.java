package proy_entornos;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la cantidad de nº: ");
		int n = entrada.nextInt();
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int contMayor = 0;
		int contMenor = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Introduce el número: ");
			int num = entrada.nextInt();
			if (num == mayor) {
				contMayor++;
			}
			if (num == menor) {
				contMenor++;
			}
			if (num < menor) {
				menor = num;
				contMenor = 1;
			}
			if (num > mayor) {
				mayor = num;
				contMayor = 1;
			}
			System.out.println("Mayor: " + mayor + "Nº veces:" + contMayor);
			System.out.println("Menor: " + menor + "Nº veces:" + contMenor);
		}
		entrada.close();
	}
}