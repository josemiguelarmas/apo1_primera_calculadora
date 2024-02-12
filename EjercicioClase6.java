import java.util.Scanner;

public class EjercicioClase6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String saborhelado; 
		System.out.println("Cual es tu sabor de helado favorito? ");
		saborhelado = in.nextLine();
		System.out.println("Tu sabor elegido fue: " + saborhelado);
		double porcentajeComision;
		System.out.println("Cual es el porcentaje de comision en la venta? ");
		porcentajeComision = in.nextDouble();
		System.out.println("Tu porcentaje de comision es " + porcentajeComision);
		
	}
}	