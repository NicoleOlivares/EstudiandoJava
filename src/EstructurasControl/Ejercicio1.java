package EstructurasControl;

import java.util.Scanner;

//Estructura control IF

public class Ejercicio1 {
	public static void main(String[] args) {
		// Enunciado: Desarrollar un programa que nos solicite un numero por teclado (el
		// que queramos), y
		// nos indique si es múltiplo de 5. Para ello usaremos la estructura de control
		// IF.

		//variable para guardar el numero que se ingresa
		int numero;
		
		//solicito el numero 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		
		//guardo el numero
		numero = teclado.nextInt();
		
		//condicion que me permite ver si es multiplo de 5
		if (numero % 5 == 0) {
			System.out.println("El número es múltiplo de 5");
		} else {
			System.out.println("El número no es múltiplo de 5");
		}

	}

}
