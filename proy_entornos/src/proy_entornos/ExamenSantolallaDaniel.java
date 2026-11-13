package proy_entornos;

import java.util.Scanner;

public class ExamenSantolallaDaniel {

	// DECLARACION DE CONSTANTES
	public static int DIVISOR_BASE = 3;
	public static int EXCEPCION_CARGA = 30;
	public static int FACTOR_MAESTRO = 300;

	
	
	
	public static void main(String[] args) {

		// Pruebas estáticas predefinidas
		System.out.println("Nodo 300 es seguro? " + isNodoSeguro(300));
		System.out.println("Nodo 30 es seguro? " + isNodoSeguro(30));
		System.out.println("Nodo 9 es seguro? " + isNodoSeguro(9));
		System.out.println("Nodo 60 es seguro? " + isNodoSeguro(60));

		
		
// Prueba interactiva unitaria
		int idPrueba = solicitarNumero("Dame un ID de nodo para comprobar: ");
		System.out.println("Nodo " + idPrueba + " es seguro? " + isNodoSeguro(idPrueba));

		
	}	
// Prueba de intervalos y consumo.
	//	 analisisNodosEntreDosIDs();
	

	
// Comprobar si el nodo es seguro o no es seguro con BOOLEAN. Para que sea seguro tiene 
//que ser divisible entre 3, no entre 30 o si es enre 300 ya es seguro.
	static boolean isNodoSeguro(int id) {
		if (id % DIVISOR_BASE == 0 && id % EXCEPCION_CARGA != 0 || id % FACTOR_MAESTRO == 0) {
			return true;
		}
		return false;
	}

// metodo para que el usuario introzca un entero y se capture la excepcion (un error) y 
//	pedira otro numero hasta que introzca un entero.
	static int solicitarNumero(String cad) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(cad);
		while (!entrada.hasNextInt()) {
			entrada.next();
			System.out.println("Numero no valido");
			System.out.print("Introduce uno nuevo: ");
		}
		int n = entrada.nextInt();
		entrada.close();
		return n;
	}

// TODO: Implementar el método analisisNodosEntreDosIDs
	static int analisisNodosEntreDosIDs (int n) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dame el ID inicial: ");
		n = entrada.nextInt();
		entrada.close();
		return n;
	}
}
