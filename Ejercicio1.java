package Capitulo8a;

public class Ejercicio1 {
	
	public static boolean esCapicua(int n) {
		
		boolean capicua=true;
		int dig=1;
		int n2=n;
		while(n2>9) {
			dig++;
			n2/=10;
		}
		for(int i=1; i<=dig/2;i++) {
			if((int)((n/Math.pow(10, dig-1))%10)!=(int)((n/(Math.pow(10, i-1)))%10)) {
				capicua=false;
			}
		}
		return capicua;
	}

}
