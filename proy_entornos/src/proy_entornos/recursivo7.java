package proy_entornos;

public class recursivo7 {

	public static int suma(int n) {
		if (n==1) {
			System.out.print("1");
			return 1;
		}
		int cadena=suma(n-1);
		System.out.print(" + "+n);
		return n + cadena;
	}

	public static void main(String[] args) {
		System.out.print(" = "+suma(5));
	}
}
