package diagramas;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num1;
		int num2;
		System.out.println("Introduzca un número");
		num1=reader.nextInt();
		
		System.out.println("Introduzca un segundo número");
		num2=reader.nextInt();
		
		if (num2 > num1) {
			System.out.println(num2 + " es mayor que " + num1);
			
		}else {
			System.out.println(num1 + " es mayor que " + num2);
		}

		reader.close();
	}

}
