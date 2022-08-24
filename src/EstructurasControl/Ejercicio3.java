package EstructurasControl;

import java.util.Scanner;

//Estructura control anidada DO WHILE + IF

public class Ejercicio3 {
	/*
	 * Enunciado: Desarrollar un programa que nos solicite un número por teclado (el
	 * que queramos) y compruebe que este número es mayor que cero. Si el número no
	 * es mayor que 0, indica el mensaje “El número es incorrecto” y se volverá a
	 * solicitar de nuevo, pero si el número es mayor que cero indicará el mensaje
	 * “El número es correcto” y no volverá a solicitar un numero. Para ello
	 * usaremos dos tipos de estructuras de control, un IF dentro de un Do While.
	 */

	public static void main(String[] args) {
		int numero;
		boolean incorrecto = true;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce un número:");
			numero = teclado.nextInt();
			if (numero > 0) {
				incorrecto = false;
				System.out.println("El número es correcto");
			} else {
				System.out.println("El número es incorrecto");
			}
		} while (incorrecto);
	}

}
