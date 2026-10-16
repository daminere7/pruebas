package proy_entornos;
import java.util.Scanner;
public class pruebas2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un nº entero: ");
		int n = entrada.nextInt();
		int nApariciones = 1;
		int nAux = n;
		while (n>10) {
			nApariciones++;
			n=n/10;
		}
		System.out.println("el n de digitos de "+nAux+" es: "+nApariciones);
		entrada.close();
	}

}
