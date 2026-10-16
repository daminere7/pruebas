package proy_entornos;
import java.util.Scanner;
public class pr2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce la nota del 0-10: ");
		nota=entrada.nextInt();
		switch (nota) {
		case 10: System.out.println("SOBRESALIENTE"); break;
		case 9: System.out.println("SOBRESALIENTE"); break;
		case 8: System.out.println("NOTABLE"); break;
		case 7: System.out.println("NOTABLE"); break;
		case 6: System.out.println("BIEN"); break;
		case 5: System.out.println("SUFICIENTE"); break;
		case 4: System.out.println("SUSPENSO"); break;
		case 3: System.out.println("SUSPENSO"); break;
		case 2: System.out.println("SUSPENSO"); break;
		case 1: System.out.println("SUSPENSO"); break;
		case 0: System.out.println("SUSPENSO"); break;
		default: System.out.println("Nota no valida"); break;
			
		}
			
		entrada.close();
		}

	}


