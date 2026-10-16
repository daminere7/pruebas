package proy_entornos;

public class ej1metodos2 {

	public static void cubo(int numero) {
		int resultado = (int) Math.pow(numero, 3);
		System.out.println("El cubo de "+numero+ " es: "+resultado);
		
	}
	public static void main(String[] args) {
		int a=4;
		cubo(a);

	}

}
