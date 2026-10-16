package proy_entornos;
import java.util.Scanner;
public class pr3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce la nota del 0-10: ");
		nota=entrada.nextInt();
		
		String resultado = (nota > 10) ? "La nota no puede ser mayor a 10"
				: (nota >=9) ? "SOBRESALIENTE"
				: (nota >=7) ? "NOTABLE"
				: (nota >=6) ? "BIEN"
				: (nota >=5) ? "SUFICIENTE"
				: (nota >=0) ? "SUSPENSO"
				: "No puede ser menor que 0";
		System.out.println(resultado);
		
		entrada.close();
	}

}
