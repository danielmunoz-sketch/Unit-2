package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num;
		System.out.println("Introduzca un número: ");
		num = reader.nextInt(); 
		
    	if(num < 0 || num > 99999) {
      		System.out.println("Número incorrecto. Introduzca un número entre 0 y 99999");
    	} else if(number < 10) {
      		System.out.println("Tiene una cifra.");
		}else if(number < 100) {
     		System.out.println("Tiene dos cifras.");
    	}else if(number < 1000) {
      		System.out.println("Tiene tres cifras.");
    	}else if(number < 10000) {
      		System.out.println("Tiene cuatro cifras.");
    	}else if(number < 100000) {
      		System.out.println("Tiene cinco cifras.");
    	}
    
		reader.close();
	}

}
