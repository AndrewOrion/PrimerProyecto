import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
			
			Scanner entrada= new Scanner(System.in);
			
			System.out.println("Introduce número 1: ");
			float num1=entrada.nextFloat();
			
			System.out.println("Introduce número 2: ");
			float num2=entrada.nextFloat();
			
			float media=(num1+num2)/2;

			System.out.println("La media es: " + media);
	}

}
