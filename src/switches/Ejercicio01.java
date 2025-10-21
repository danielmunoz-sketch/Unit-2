package switches;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int nota;
		System.out.println("Introduzca la nota: ");
		nota = reader.nextInt();
		
		switch (nota) {
		
		case 0, 1, 2, 3, 4: 
			System.out.println("Insuficiente");
			break;
			
		case 5: 
			System.out.println("Suficiente");
			break;
			
		case 6: 
			System.out.println("Bien");
			break;
			
		case 7, 8:
			System.out.println("Notable");
			break;
			
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
			
		};
		
		reader.close();
	}

}
