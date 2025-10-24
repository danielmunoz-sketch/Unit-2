package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		Random aleatorio = new Random();
		
		int num1 = aleatorio.nextInt(1,100);
		int num2 = aleatorio.nextInt(1,100);
		
		int sumaUsuario;
		int sumaAleatorios = num1 + num2;
		
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		
		System.out.println("Cuál es la suma de " + num1 + " y " + num2 + " ?");
		sumaUsuario = reader.nextInt();
		
		if (sumaAleatorios == sumaUsuario) {
			System.out.println("Has acertado");
		}else {
			System.out.println("Es incorrecto. La suma es " + sumaAleatorios);
		}
		reader.close();
	}

}
