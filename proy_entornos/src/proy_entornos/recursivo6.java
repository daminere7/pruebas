package proy_entornos;

public class recursivo6 {

	public static boolean orden(String cadena, char letra) {
		if (cadena.length() == 0) {
			return true;
		} else if (cadena.charAt(0) < letra) {
			return false;
		} else {
			if (letra < cadena.charAt(0)) {
				letra = cadena.charAt(0);
			}
			return orden(cadena.substring(1), letra);
		}

	}

	public static void main(String[] args) {
		System.out.println(orden("abcd", 'A'));
		System.out.println(orden("bcad", 'A'));
	}
}
