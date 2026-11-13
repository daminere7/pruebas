package proy_entornos;

public class IniciacionArrays3 {

	public static String letra(String[] array, char caract) {
		String resultado = "";
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i].charAt(0) == caract) {
				resultado = resultado.concat(array[i] + " ");
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		String[] arrays = { "algo", "Algo", "Piedra", "angel", "Sol" };
		char caract = 'a';
		System.out.print(letra(arrays, caract));
	}
}