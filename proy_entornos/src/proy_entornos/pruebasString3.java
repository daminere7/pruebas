package proy_entornos;

import java.util.Scanner;

public class pruebasString3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String t=entrada.nextLine();
		t=t.trim();
		int p=0;
		
		if (t.length()>0) {
			p=1;
			for (int i=1;i<t.length();i++) {
				if (t.charAt(i) != ' ' && t.charAt(i - 1) == ' ') {
					p++;
				}
			}
		}
		System.out.println("Cantidad de palabras: "+p);
		entrada.close();
	}
}
