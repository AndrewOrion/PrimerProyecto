import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Radio: ");
		double radio=entrada.nextInt();
		
		final double pi=3.1416; // constante

		System.out.printf("La longitud es %.3f y el area es %.3f",(2*pi*radio), (pi * Math.pow(radio, 2)));

	}

}
