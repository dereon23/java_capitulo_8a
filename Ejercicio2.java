package Capitulo8a;

public class Ejercicio2 {

	public static boolean esPrimo(int n) {
		boolean primo=true;
		for(int i=2;i<(n/2)+1;i++) {
			if(n%i==0) {
				primo=false;
			}
		}
		return primo;
	}
	
	
}
