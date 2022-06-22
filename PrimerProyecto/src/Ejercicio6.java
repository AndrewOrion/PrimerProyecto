import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce la velocidad en Km/h: ");
		double kmh=teclado.nextDouble();
		double ms;
		ms = kmh*1000/3600;

		System.out.printf("%.2f Km/h son %.2f m/s",kmh,ms);

	}

}
