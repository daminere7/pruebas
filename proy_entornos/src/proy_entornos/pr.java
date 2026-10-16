package proy_entornos;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce la nota del 0-10: ");
		nota = entrada.nextInt();
		if (nota > 10) {
			System.out.println("La nota no puede ser mayor que 10");
		} else {
			if (nota >= 9) {
				System.out.println("SOBRESALIENTE");
			} else {
				if (nota >= 7) {
					System.out.println("NOTABLE");
				} else {
					if (nota == 6) {
						System.out.println("BIEN");
					} else {
						if (nota >= 5) {
							System.out.println("SUFICIENTE");
						} else {
							if (nota >= 0) {
								System.out.println("SUSPENSO");
							} else {
								System.out.println("No puede ser menor que 0");
							}
						}
					}
				}
			}
		}
		entrada.close();
	}
}