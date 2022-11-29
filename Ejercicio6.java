package Capitulo8a;

public class Ejercicio6 {
	
	public static long voltea(long n){
		long volt=0;
		for(int i=0; i<Ejercicio5.digitos(n); i++) {
			volt=volt*10+(long)((n/(Math.pow(10,i)))%10);
		}
		return  volt;
		
	}

}
