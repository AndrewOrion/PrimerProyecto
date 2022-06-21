import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println(" Calculo de grados centigrados a Fahrenheit ");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("Introduce grados centigrados: ");
		
		float c=entrada.nextFloat();

		System.out.println(c + " grados centigrados son " + ((9*c/5)+32) + " grados Fahrenheit ");

	}

}
