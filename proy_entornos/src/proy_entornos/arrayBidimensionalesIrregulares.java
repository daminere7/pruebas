package proy_entornos;

import java.util.Arrays;

public class arrayBidimensionalesIrregulares {

	
	public static void imprimir (Object[] dato) {
		
	}
	
	
	public static void main(String[] args) {
		int [][][] array = {{ {1,2,5}, { 1, 2 }, { 1, 3,7 }}};
		for (int[][] sub : array) {
			for (int[] dato : sub) {
				RecursivoMostrarArray2.imprimirArray(array);
			}
			System.out.println("");
		}
	}
}

