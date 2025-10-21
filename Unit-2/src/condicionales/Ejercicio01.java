package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num;
		boolean capicua = false;
		System.out.println("Introduzca un número: ");
		num = reader.nextInt(); 
		
    	if(num < 0 || num > 99999) {
      		System.out.println("Número incorrecto. Introduzca un número entre 0 y 99999");
    	}else if (num < 10 || 10 < num && num < 100 && num % 10 == num / 10 
    			|| 100 < num && num < 1000 && num % 10 == num / 100 
    			|| 1000 < num && num < 10000 && num % 10 == num / 1000 && (num / 100) % 10 == (num / 10) % 10){
    		capicua = true;
    	}
    	
    	if (capicua) {
    		System.out.println("Es capicua");
    	}else {
    		System.out.println("No es capicua");
    	}
    	reader.close();
	}

}
