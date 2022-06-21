import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce numero: ");
		int num1=entrada.nextInt();
		
		int doble=num1*2;
		int triple=num1*3;

		System.out.println("El doble de " + num1 + " es: " + doble + " y el triple es " + triple);

	}

}
