package switches;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num1;
		int num2;
		int rSum;
		int rRest;
		int rMult;
		double rDiv;
		String opcion;

		System.out.println("Introduzca dos números: ");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		
		System.out.println("Elija una opción: ");
		System.out.println("A.	SUMAR LOS NÚMEROS");
		System.out.println("B.	RESTAR LOS NÚMEROS");
		System.out.println("C.	MULTIPLICAR LOS NÚMEROS");
		System.out.println("D.	DIVIDIR LOS NÚMEROS");
		opcion = reader.next();
		
		switch (opcion) {
		
		case "A":
			rSum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + rSum);
			break;
		case "B":
			rRest = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + rRest);
			break;
		case "C":
			rMult = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + rMult);
			break;
		case "D":
			if (num2 == 0 ) {
				System.out.println("No se puede dividir por 0");	
			}else {
				rDiv = (double) num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + rDiv);
			}
			break;
		default:
			System.out.println("Opción no válida");
		};
		
		reader.close();
	}

}
