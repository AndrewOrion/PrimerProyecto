import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("AREA DE UN TRIANGULO");
		System.out.println("---------------------");
		
		System.out.println("Introduce el lado 1: ");
		double lado1=teclado.nextDouble();
		System.out.println("Introduce el lado 2: ");
		double lado2=teclado.nextDouble();
		System.out.println("Introduce el lado 3: ");
		double lado3=teclado.nextDouble();
		
		double area;
		
		area=Math.sqrt( ( (lado1+lado2+lado3)/2 )*( ( (lado1+lado2+lado3)/2 )-lado1)
				*( ( (lado1+lado2+lado3)/2 )-lado2)*( ( (lado1+lado2+lado3)/2 )-lado3) );

		System.out.printf("El area del triangulo es %.2f",area);

	}

}
