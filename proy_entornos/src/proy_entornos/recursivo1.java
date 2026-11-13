package proy_entornos;

public class recursivo1 {

	public static int calculodigitos (int n) {
		if (n>=10) {
			return 1+calculodigitos(n/10);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculodigitos(10));
		System.out.println(calculodigitos(0));
		System.out.println(calculodigitos(9));
		System.out.println(calculodigitos(12345));
	}

}
