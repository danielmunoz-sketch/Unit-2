package diagramas;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num1;
		int num2;
		int suma;
		int resta;
		int multi;
		double div;
		System.out.println("Introduzca un número");
		num1=reader.nextInt();
		
		System.out.println("Introduzca un número");
		num2=reader.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 - num2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es:" + multi);
		
		if (num2==0) {
			System.out.println("Error, no se puede dividir un número entre 0");
			
		}else {
			div = num1 / num2;
			System.out.println("La división es: " + div);
		}
		
		
		
		
		
		reader.close();
	}

}
