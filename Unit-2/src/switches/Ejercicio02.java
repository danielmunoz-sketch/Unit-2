package switches;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int dia;
		System.out.println("Introduzca un número que corresponda a un dia de la semana: ");
		dia = reader.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Hoy es Lunes");
			break;
			
		case 2:
			System.out.println("Hoy es Martes");
			break;
			
		case 3:
			System.out.println("Hoy es Miércoles");
			break;
			
		case 4:
			System.out.println("Hoy es Jueves");
			break;
			
		case 5:
			System.out.println("Hoy es Viernes");
			break;
			
		case 6:
			System.out.println("Hoy es Sábado");
			break;
			
		case 7:
			System.out.println("Hoy es Domingo");
			break;
			
		};
		
		reader.close();
	}

}
