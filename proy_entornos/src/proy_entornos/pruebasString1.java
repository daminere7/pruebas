package proy_entornos;

import java.util.Scanner;

public class pruebasString1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String p = entrada.nextLine();

		for (int i = 0; i < p.length(); i++) {
			System.out.println(p.charAt(i) + " ");
		}
		entrada.close();
	}
}
