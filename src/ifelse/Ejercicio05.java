package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		String jug1;
    	String jug2;
    
		System.out.println("Introduzca las jugadas: ");
		jug1 = reader.next();
   	 	jug2 = reader.next();
		
    	if(jug1.equals(jug2)) {
      		System.out.println("Empate");
    	} else if(jug1.equals(Piedra) && jug2.equals(Tijeras) || jug1.equals(Papel) && jug2.equals(Piedra) || jug1.equals(Tijeras) && jug2.equals(Papel)) {
      		System.out.println("Gana el jugador 1");
		}else {
      		System.out.println("Gana el jugador 2");
    	}

    	reader.close();
  	}

}
