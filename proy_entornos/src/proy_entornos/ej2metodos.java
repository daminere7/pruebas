package proy_entornos;

public class ej2metodos {
	public static void dibrelleno(int lado) {
		for (int j = 1; j <= lado; ++j) {
			for (int i = 1; i <= lado; ++i) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void dibsinrelleno(int lado) {
		for (int j = 1; j <= lado; ++j) {
			for (int i = 1; i <= lado; ++i) {
				if (j == 1 || j == lado || i == 1 || i == lado) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int lado = 5;
		System.out.println("Cuadrado relleno:");
		dibrelleno(lado);
		System.out.println();
		System.out.println("Cuadrado vacío:");
		dibsinrelleno(lado);
	}
}
