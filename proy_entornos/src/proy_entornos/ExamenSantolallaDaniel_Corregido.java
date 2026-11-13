package proy_entornos;

import java.util.Scanner;

public class ExamenSantolallaDaniel_Corregido {

	// DECLARACION DE CONSTANTES
	protected static final int DIVISOR_BASE = 3;
	protected static final int EXCEPCION_CARGA = 30;
	protected static final int FACTOR_MAESTRO = 300;

	public static void main(String[] args) {

		// Pruebas estáticas predefinidas
		System.out.println("Nodo 300 es seguro? " + isNodoSeguro(300));
		System.out.println("Nodo 30 es seguro? " + isNodoSeguro(30));
		System.out.println("Nodo 9 es seguro? " + isNodoSeguro(9));
		System.out.println("Nodo 60 es seguro? " + isNodoSeguro(60));

// Prueba interactiva unitaria
		int idPrueba = solicitarNumero("Dame un ID de nodo para comprobar: ");
		System.out.println("Nodo " + idPrueba + " es seguro? " + isNodoSeguro(idPrueba));

	
// Prueba de intervalos y consumo.
	 analisisNodosEntreDosIDs();
	}
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
	static int solicitarNumero(String mensaje) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean correcto = false;
		do {
			try {
				System.out.print(mensaje);
				n = sc.nextInt();
				correcto = true;
			} catch (Exception ex) {
				System.out.println("Valor no valido");
				sc.nextLine();
			}
		} while (!correcto);
		return n;
	}

// TODO: Implementar el método analisisNodosEntreDosIDs
	static void analisisNodosEntreDosIDs() {
		int id_inicial = solicitarNumero("Dame el ID inicial: ");
		int id_final = solicitarNumero("Dame el ID final: ");
		String seguro = "", noseguro = "";
		int consumoTotal = 0;
		for (int i = id_inicial; i <= id_final; i++) {
			if (isNodoSeguro(i)) {
				seguro = seguro + i + ", ";
				consumoTotal += 120;
			} else {
				noseguro = noseguro + i + ", ";
				consumoTotal += 80;
			}
		}
		System.out.println("Los siguientes nodos son seguros: " + seguro);
		System.out.println("Los siguientes nodos no son seguros: " + noseguro);
		System.out.println("El consumo energetico total de los nodos del " + id_inicial + " al " + id_final + " es de " + consumoTotal + " vatios");
	}
}
