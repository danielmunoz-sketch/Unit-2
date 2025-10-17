package ifelse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num;
		System.out.println("Introduzca un número entero: ");
		num = reader.nextInt(); 
		
		if(num % 2 == 0) {
			System.out.println("Es un número par");
		}else {
			System.out.println("Es un número impar");
		}
		reader.close();
	}

}
