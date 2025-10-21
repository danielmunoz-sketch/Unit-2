package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num;
		System.out.println("Introduzca un número: ");
		num = reader.nextInt(); 
		
		num = num < 0 ? -num : num;
		
		System.out.println("El valor absoluto es " + num);
	}

}
