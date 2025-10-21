package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int seg;
		int min;
		int horas;
		
		System.out.println("Introduzca el número de segundos: ");
		seg = reader.nextInt();
		
		System.out.println("Introduzca el número de minutos: ");
		min = reader.nextInt();
		
		System.out.println("Introduzca el número de horas: ");
		horas = reader.nextInt();
		
		if (seg<59) {
			seg++;
		}else {
			seg=0;
			if (min<59) {
				min++;
			}else {
				min=0;
				if (horas<23) {
					horas++;
				}else {
					horas=0;
				}
			}
		}
		System.out.println(horas + ":" + min + ":" + seg);
		reader.close();
	}

}
