package proy_entornos;

public class recursivo3 {

	public static int cambio (int n) {
	if (n>=10) {
		return ((cambio(n%10))*10)+(n/10);
	}else {
		return n;
	}
	}
	
	public static void main(String[] args) {
	System.out.println(cambio(124));
	}

}
