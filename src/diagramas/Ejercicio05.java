package diagramas;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num;
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();
		
		if (num>=0) {
			System.out.println("Es positivo");
		}else {
			System.out.println("Es negativo");
		}
		reader.close();
	}

}
