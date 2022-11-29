package Capitulo8a;

public class Ejercicio8 {
	
	public static int posicionDeDigito(int n, int d) {
		
		int digito=0;
		while(digito!=Ejercicio7.digitoN(n, digito)&&digito<Ejercicio5.digitos(n)) {
			digito++;
		}
		if(digito==Ejercicio5.digitos(n)) {
			return -1;
		}else {
			return digito;
		}
	}

}
