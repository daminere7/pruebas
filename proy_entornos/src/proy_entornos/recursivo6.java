package proy_entornos;

public class recursivo6 {

	public static boolean orden(String palabra) {
		if (palabra.length()<=1) {
			return true;
		}
		if (palabra.charAt(0)>palabra.charAt(1)) {
			return false;
		}
		return orden(palabra.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(orden("abcd"));
		System.out.println(orden("bcad"));
	}
}
