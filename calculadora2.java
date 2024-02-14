import java.util.Scanner;

public class calculadora2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Por favor escribe el numero 1: ");
		int entero1 = entrada.nextInt();
		System.out.println("Por favor escribe el numero 2: ");
		int entero2 = entrada.nextInt();
		//Comienzo las operaciones
		int suma = entero1 + entero2;
		int resta = entero1 - entero2;
		int producto = entero1 * entero2;
		int division = entero1 / entero2;
		int modulo = entero1 % entero2;
		//Mostrar los resultados
		System.out.println("Resultado de la suma: " + suma);
		System.out.println("Resultado de la resta: " + resta);
		System.out.println("Resultado del producto: " + producto);
		System.out.println("Resultado de la division: " + division);
		System.out.println("Resultado del modulo: " + modulo);
	}
}