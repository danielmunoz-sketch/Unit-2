package diagramas;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduzca un número");
		num1=reader.nextInt();
		
		System.out.println("Introduzca un segundo número");
		num2=reader.nextInt();
		
		System.out.println("Introduzca un tercer número");
		num3=reader.nextInt();
		
		if (num1 < num3 && num2 < num3) {
			System.out.println(num3 + " es el mayor");
			
		}else if (num1 < num2){
			System.out.println(num2 + "es el mayor");
		}else {
			System.out.println(num1 + "es el mayor");
		}

		reader.close();
	}

}
