package proy_entornos;

public class tabla {
	public static void main(String[] args) {
		byte i = 0;
		byte j = 0;
		int resultado;

		while (i <= 10) {
			j = 0;

			while (j <= 10) {
				resultado = i * j;
				System.out.println(i + " x " + j + " = " + resultado);
				j++;
			}
			i++;
		}
	}
}