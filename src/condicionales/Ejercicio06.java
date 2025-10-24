package condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int mes;
		int año;
		int dias = 0;
		boolean bisiesto;
		
		System.out.println("Introduzca un mes y un año: ");
		mes = reader.nextInt(); 
		año = reader.nextInt();
		
		bisiesto = año%4 == 0; 
		
		switch (mes) {
		case 1, 3, 5, 6, 9, 11 -> dias = 30;
		case 4, 7, 8, 10, 12 -> dias = 31;
		case 2 ->{ if (bisiesto) {
				dias = 29;
			}else {
				dias = 28;
			}
		}
		}
		
		if(bisiesto) {
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año no es bisiesto");
		}
		
		System.out.println("Y el mes tiene " + dias + " días");
		reader.close();
	}

}
