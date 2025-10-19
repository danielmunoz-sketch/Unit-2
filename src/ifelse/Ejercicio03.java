package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int coefA;
		int coefB;
		int coefC;
		double sol1;
		double sol2;
		double discr;
		
		System.out.println("Introduzca el coeficiente a: ");
		coefA = reader.nextInt();
		
		System.out.println("Introduzca el coeficiente b: ");
		coefB = reader.nextInt();
		
		System.out.println("Introduzca el coeficiente c: ");
		coefC = reader.nextInt();
		
		discr = coefB * coefB - 4*coefA*coefC;
		
		if (coefA == 0) {
			sol1 = (double) - coefC / coefB;
			System.out.println("La ecuación solo tiene una solución " + sol1);
			
		}else if (discr >= 0) {
			sol1 = (-coefB + Math.sqrt(discr)) / (2*coefA);
			sol2 = (-coefB - Math.sqrt(discr)) / (2*coefA);
			
		}else {
			System.out.println("La ecuación no tiene solución");
			
		}

		reader.close();
	}

}

