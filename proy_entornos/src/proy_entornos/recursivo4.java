package proy_entornos;

public class recursivo4 {

	public static int resultado = 0;

	public static boolean comprobar(int n) {
		if (n == 1 || n == 0) {
			return true;
		} else if (n % 10 == 0 || n % 10 == 1) {
			return comprobar(n / 10);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("el n 1000010001 es binario " + comprobar(1000010001));
		System.out.println("el n 1000020001 es binario " + comprobar(1000020001));
		System.out.println("el n 2000010001 es binario " + comprobar(2000010001));
		System.out.println("el n 1000010009 es binario " + comprobar(1000010009));
	}

}
