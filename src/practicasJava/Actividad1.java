package practicasJava;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		// System.out.println("hola actividad1");

		// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no
		// lo es, también debemos indicarlo.

		// crear variable
		int numero;
		// scanner para ingresar el número
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		// variable que guarda el número ingresado
		numero = teclado.nextInt();
		// if con condición y else con la otra respuesta
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es divisible por 2");
		} else {
			System.out.println("El número " + numero + " no es divisible por 2");
		}
	}

}
