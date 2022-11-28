package Capitulo8a;

public class Ejercicio5 {
	
	public static int digitos(long n) {
		int dig=1;
		while(n>9) {
			dig++;
			n/=10;
		}
		return dig;
	}

}
