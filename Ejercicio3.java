package Capitulo8a;

public class Ejercicio3 {
	
	public int siguientePrimo(int n) {
		do {
			n++;
		}while(!Capitulo8a.Ejercicio2.esPrimo(n));
		return n;
	}

}
