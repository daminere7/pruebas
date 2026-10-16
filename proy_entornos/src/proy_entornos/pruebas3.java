package proy_entornos;

import java.util.Scanner;

public class pruebas3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un nº entero: ");
		int n = entrada.nextInt();
		int suma = 0;
		String cadena = "";
		while (n > 0) {
			suma = suma + n;
			if (cadena.equals("")) {
				cadena = cadena + n;
			} else {
				cadena = cadena + "+" + n;
			}
			System.out.println("Introduce otro nº entero: ");
			n = entrada.nextInt();
		}
		System.out.println("La suma de " + cadena + "=" + suma);
		entrada.close();
	}
}
