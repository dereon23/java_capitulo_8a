package Capitulo8a;

public class Ejercicio13 {

	public static int trozoDeNumero(int n, int d1, int d2) {
		return Ejercicio9.quitaPorDetras(Ejercicio10.quitaPorDelante(n, d1-1), d2-1);
	}
	
}
