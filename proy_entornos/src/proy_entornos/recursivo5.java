package proy_entornos;

public class recursivo5 {

	public static int convertir(int n) {
		if (n < 2) {
			return n;
		} else {
			return convertir(n / 2) * 10 + n % 2;
		}

	}

	public static void main(String[] args) {
		System.out.println(convertir(256));

	}
}