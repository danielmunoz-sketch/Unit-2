package diagramas;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		double nota;
		System.out.println("Introduzca una nota: ");
		nota = reader.nextDouble();
		
		if (nota<3) {
			System.out.println("Muy Deficiente");
		}else if (3 <= nota && nota <= 5) {
			System.out.println("Insuficiente");
		}else if (5 <= nota && nota <= 7){
			System.out.println("Bien");
		}else if (7 <= nota && nota <= 9) {
			System.out.println("Notable");
		}else if (9 <= nota && nota <= 10) {
			System.out.println("Sobresaliente");
		}
		
		reader.close();
	}

}
