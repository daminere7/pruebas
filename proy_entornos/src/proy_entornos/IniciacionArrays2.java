package proy_entornos;

public class IniciacionArrays2 {

	public static void longitud(String[] array) {
		String mayor = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > mayor.length()) {
				mayor = array[i];
			}
		}

		System.out.println("La más larga: " + mayor);
	}

	public static void main(String[] args) {
		String[] array = { "Hola", "Casa", "Lugar", "Balones" };
		longitud(array);
	}
}