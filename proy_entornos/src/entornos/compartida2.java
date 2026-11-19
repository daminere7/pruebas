package entornos;

import java.util.Arrays;
import java.util.Scanner;

public class compartida2 {
	private static int[][] matriz;
	private static boolean[] usados;
	
	private static boolean existe(int numero) {
		return usados[numero-1];		
	}
	
	
	public static int numeroAzar(int max) {
		return (int) numeroAzar(1,max);
	}
	
	public static int numeroAzar(int min, int max) {
		int resultado=0;
		do {
			resultado=(int) (Math.random()*(max-min+1)+min);
		}while (usados[resultado-1]);
		usados[resultado-1]=true;
		return resultado;
	}
	
	
	public static int[][] crearMatriz(int filas){		
	      matriz=new int[filas][filas];		
		 for (int i=0;i<matriz.length;i++) {         			
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j]= numeroAzar(filas*filas);
			}			
		}
		return matriz;
	}
	
		
	public static void main(String[] args) {	
		usados=new boolean[3*3];
		int[][] matriz=crearMatriz(3);
		
		 System.out.println(Arrays.deepToString(matriz));
	}

}

