package proy_entornos;

public class IniciacionArrays1 {

	public static int contador(int[] array,int n) {
		int veces = 0;
		for (int i=0;i < array.length; i++) {
			if (array[i]==n) {
				veces++;
			}
		}return veces;
	}
	
	public static void main(String[] args) {
	int [] array = {1,5,1,3,2,1,9,2};
	int n = 1;
	System.out.println("El "+n+" aparece "+contador(array, n)+" veces");

	}

}
