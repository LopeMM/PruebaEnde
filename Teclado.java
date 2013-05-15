
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* 	Permite lectura desde teclado
*	@author Lope Monedero Moreno
*	@version 1.0
*/
public class Teclado {
	/**
	*	Lee una cadena desde el teclado
	*	@return cadena
	*	Devuelve el valor de un string
	*/
	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); //Lee una l?nea de texto (hasta intro)
		} catch( Exception e ) {
			cadena = "";
		}
		return cadena;
	}

	/**
	* 	Lee un caracter desde el teclado
	*	@return caracter
	*	Devuelve un caracter
	*/
	 public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch( Exception e ) {
			caracter = 0;
		}
		return caracter;
	}
	
	/**
	*	Lee un entero desde el teclado
	*	@return entero
	*	Devuelve un entero
	*/
	public static int leerEntero() {
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); //Quita los espacios del String y convierte a int
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}
}