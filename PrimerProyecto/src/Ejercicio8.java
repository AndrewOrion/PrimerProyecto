import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("VOLUMEN DE UNA ESFERA");
		System.out.println("---------------------");
		
		System.out.println("Introduce el radio: ");
		double rad=teclado.nextDouble();
		
		double volumen;
		final double pi=3.1416;
		
		volumen=(4/3)*pi*Math.pow(rad, 3);

		System.out.printf("El volumen de la esfera es %.2f",volumen);

	}

}
