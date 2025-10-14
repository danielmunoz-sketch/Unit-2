package diagramas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader =  new Scanner (System.in);
		
		int edad;
		System.out.println("Introduzca la edad: ");
		edad = reader.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		reader.close();
	}

}
