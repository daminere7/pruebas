package proy_entornos;

public class recursivo2 {

	public static int calculo(int n1, int n2) {
		if (n1 <= 0 || n2 <= 0) {
			System.out.println("El numero debe ser positivo");
			return 0;
		}
		if (n2 == 1) {
			return n1;
		} else {
			return n1 * calculo(n1, n2 - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(calculo(2, 0));
	}

}
