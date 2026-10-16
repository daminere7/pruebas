package proy_entornos;

public class ej1metodos4 {

	public static void menu(int opcion) {
		int i = 1;
		for (; i <= opcion ; i++) {
			System.out.println("Opcion " +i);
		}
		System.out.println("Opcion " + opcion + " - Salir");
		System.out.println();
	}
	public static void main(String[] args) {
		menu(5);
	}

}
