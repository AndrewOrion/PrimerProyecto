import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TEOREMA DE PITAGORAS");
		System.out.println("--------------------");
		System.out.println("Introduce cateto 1: ");
		double cat1=teclado.nextDouble();
		System.out.println("Introduce cateto 2: ");
		double cat2=teclado.nextDouble();

		double hipo;
		hipo = Math.pow(cat1,2)+Math.pow(cat2,2);

		System.out.printf("La hipotenusa es %.2f",Math.sqrt(hipo));

	}

}
