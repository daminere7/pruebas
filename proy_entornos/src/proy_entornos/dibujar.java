package proy_entornos;

public class dibujar {

	public static void main(String[] args) {
		dibujar(12);
		dibujar(12,true);
		dibujar(12,10);
		dibujar(12,10,true);

	}
	public static void dibujar (int altura) {
		dibujar (altura,true);
	}
	public static void dibujar (int altura,boolean relleno) {
		dibujar (altura,altura,relleno);
	}
	public static void dibujar (int altura,int base) {
		dibujar (altura,base,true);
	}
	public static void dibujar (int altura,int base,boolean relleno) {
		
	}
}
