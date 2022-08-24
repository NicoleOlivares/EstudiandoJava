package Ejercicios;

public class SentenciAnidada {

	public static void main(String[] args) {
		int limite = 20;
		System.out.println("Mostrar pares hasta el 20");

		for (int contador = 0; contador <= limite; contador++) {
			if (contador % 2 == 0) {
				System.out.println(contador + " ");
			}
		}
	}

}
