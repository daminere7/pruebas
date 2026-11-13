package proy_entornos;

import java.util.Arrays;

public class copiarYpegar {


	    public static void main(String[] args) {
	        
	        //declaración e inicialización
	        int[] primos = {1, 2, 3, 5, 7, 11, 13};
	        int[] copia = new int[primos.length];        
	        
	        //copia
	        System.arraycopy(primos, 1, copia, 3, 3);        
	        
	        //salida
	        System.out.println(Arrays.toString(primos)); // [1,2,3,5,7,11,13]
	        System.out.println(Arrays.toString(copia));  // [0,0,0,2,3,5,0]  
	    }
	}

//
