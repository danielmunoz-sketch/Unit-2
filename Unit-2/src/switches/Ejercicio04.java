package switches;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		String tirada1;
		String tirada2;
		int num1 = 0;
		int num2 = 0;
		int res;

		System.out.println("Introduzca el resultado de la primera tirada (“UNO”, “DOS” … “SEIS”): ");
		tirada1 = reader.next();
		
		switch (tirada1) {
		
		case "UNO" ->
			num1 = 1;
			
		case "DOS" ->
			num1 = 2;
			
		case "TRES" ->
			num1 = 3;
			
		case "CUATRO" ->
			num1 = 4;
			
		case "CINCO" ->
			num1 = 5;
			
		case "SEIS" ->
			num1 = 6;
		};
		
		System.out.println("Introduzca el resultado de la segunda tirada (“UNO”, “DOS” … “SEIS”): ");
		tirada2 = reader.next();
		
		switch (tirada2) {
		
		case "UNO" ->
			num2 = 1;
			
		case "DOS" ->
			num2 = 2;
			
		case "TRES" ->
			num2 = 3;
			
		case "CUATRO" ->
			num2 = 4;
			
		case "CINCO" ->
			num2 = 5;
			
		case "SEIS" ->
			num2 = 6;
		};
		
		res = num1 + num2;
		System.out.println("La suma de las dos tiradas es " + res);
		
		reader.close();

	}

}
