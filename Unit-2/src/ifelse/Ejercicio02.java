package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		double num;
		
		System.out.println("Introduzca un número decimal: ");
		num = reader.nextDouble();
		
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("Es un número casi-cero");
		}else {
			System.out.println("No es un casi-cero");
		}
		reader.close();
	}

}
