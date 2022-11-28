package Capitulo8a;

public class Ejercicio4 {
	
	public static int potencia(int base, int exponente) {
		int pot=1;;
		for(int i=0; i<exponente;i++) {
			pot*=base;
		}
		return pot;
	}

}
