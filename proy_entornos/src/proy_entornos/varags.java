package proy_entornos;

public class varags {

	public static void main(String[] args) {
		int a=2, b=3;
		mostrarEnteros();
		System.out.println();
		mostrarEnteros(1,2,3);
		System.out.println();
		mostrarEnteros(b,a++,a*b,++b);

	}
	static void mostrarEnteros(int... nums) {
	    System.out.print("Hay " + nums.length + " enteros: ");
	    for (int i = 0; i < nums.length; i++) {
	        System.out.print(nums[i] + " ");
	    }
	}  
}
