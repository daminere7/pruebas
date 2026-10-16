package entornos;



public class ej1 {

	public static void main(String[] args) {
		System.out.println(ejercicio1(0));

	}

	public static String ejercicio1(int n) {
		if (n == 0)
			return "Cero";
		else if (n > 0)
			return "Positivo";
		else
			return "Negativo";
	}
}
