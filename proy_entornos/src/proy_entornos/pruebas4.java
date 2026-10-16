package proy_entornos;

import java.util.Scanner;

public class pruebas4 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int origen=0;
		String cadena="";
		int total=0;
		while ((origen=entrada.nextInt())!=0) {
			if (comprobarNumero(origen)) {
				total+=origen;
				if (cadena.length()>0) {
					cadena=cadena.concat("+");
				}
				cadena=cadena+origen;
			}
		}
		System.out.println(cadena+"="+total);
		entrada.close();
	}

	/**
	 * Metodo q  dice si la suma de las cifras de ese numero corresponde con el
	 * numero de digitos
	 * 
	 * @param origen numero de origen
	 * @return boolean true si es correcto false sino
	 */
	static boolean comprobarNumero(int origen) {
			int numero=0;
			int suma=0;
			while (origen!=0) {
				suma+=(origen%10);
				origen=origen/10;
				numero++;
			}
		if (suma==numero) {
			return true;
		}else {
			return false;
		}
			
		
	}
}
