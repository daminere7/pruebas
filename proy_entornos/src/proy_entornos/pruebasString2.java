package proy_entornos;

import java.util.Scanner;

public class pruebasString2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mayor = "";
		int longitudMayor = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce la palabra " + i + ": ");
			String palabra = entrada.next();

			if (palabra.length() > longitudMayor) {
				mayor = palabra;
				longitudMayor = palabra.length();
			} else if (palabra.length() == longitudMayor) {
				mayor = mayor + " " + palabra;
			}
		}
		System.out.println("Las palabras más largas son: " + mayor);
		entrada.close();
	}
}
