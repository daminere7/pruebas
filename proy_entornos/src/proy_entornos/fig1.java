package proy_entornos;
import java.util.Scanner;
public class fig1 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = escaner.nextInt();
        System.out.print("Introduce la altura: ");
        int altura = escaner.nextInt();
        System.out.print("Introduce relleno 1 o sin relleno 0");
        int relleno = escaner.nextInt();

        for(int i = 1; i <= altura; ++i) {
            for(int j = 1; j <= base; ++j) {
                if (i != 1 && i != altura && j != 1 && j != base && relleno != 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        escaner.close();
    }
}
