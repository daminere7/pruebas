package proy_entornos;

public class recursivo3 {

	public static int resultado = 0;

	public static int cambio(int n) {
		if (n >= 10) {
			resultado = (n % 10) + (resultado * 10);
			return cambio(n / 10);
		} else {
			resultado = (n % 10) + (resultado * 10);
			return resultado;
		}
	}

	public static void main(String[] args) {
		System.out.println(cambio(1234));
		System.out.println(resultado);
	}
}
