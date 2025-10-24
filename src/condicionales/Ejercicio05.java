package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int numDias;
		int kilometros;
		double precio;
		System.out.println("Introduzca un número de dias y kilómetros: ");
		numDias = reader.nextInt(); 
		kilometros = reader.nextInt();
		
		precio = 2.5 * kilometros;
		
		if (kilometros >= 800 && numDias >= 7) {
			precio = precio - (0.3 * precio);
		}
		
		System.out.println("El billete del tren vale  " + precio + " €");
		
		reader.close();
	}

}
