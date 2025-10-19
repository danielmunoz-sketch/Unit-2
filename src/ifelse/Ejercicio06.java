package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduzca un número");
		num1=reader.nextInt();
		
		System.out.println("Introduzca un segundo número");
		num2=reader.nextInt();
		
		System.out.println("Introduzca un tercer número");
		num3=reader.nextInt();
		
		if (num1 + num2 == num3) {
			System.out.println(num1 "+" num2 "=" mun3);
		}else if (num2 + num3 == mun1){
			System.out.println(num2 "+" num3 "=" mun1);
		}else if(num1 + num3 == mun2){
			System.out.println(num1 "+" num3 "=" mun2);
		}else {
			System.out.println("No se pueden sumar dos de estos números para que de como resultado otro de los número");
		}

		reader.close();
	}

}
