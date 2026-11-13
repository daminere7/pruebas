package proy_entornos;

public class factorial {

	
	private static int factorial (int numero) {
		int resultado=1;
		if (numero>0) {
			resultado=numero*factorial(numero-1);
		}else {
			resultado=1;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(5));

	}

}
