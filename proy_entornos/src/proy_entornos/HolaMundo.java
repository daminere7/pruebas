package proy_entornos;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, como te llamas??");
		Scanner escaner = new Scanner(System.in);
		System.out.println("Hola, " + escaner.nextLine());
		escaner.close();
	}

}
