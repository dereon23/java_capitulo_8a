package Capitulo8a;

public class Ejercicio7 {
	
	public static int digitoN(int n, int pos){
		n=n/((10^(Ejercicio5.digitos(n)-1-pos))%10);
		return n;
	}

}
